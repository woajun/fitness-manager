<script lang="ts" setup>
import { computed, ref } from 'vue';
import { VueScrollPicker } from 'vue-scroll-picker';
import type { ScrollPickerOptionable } from 'vue-scroll-picker/lib/components/picker';

const props = defineProps<{
  label: string
  modelValue: number
  options: ScrollPickerOptionable[]
  color?: 'red' | 'green' | 'purple'
}>();
const emit = defineEmits<{(e:'update:modelValue', modelValue: number): void;
}>();

const value = computed({
  get() {
    return props.modelValue;
  },
  set(modelValue) {
    emit('update:modelValue', modelValue);
  },
});

const style = computed(() => {
  switch (props.color) {
    case 'red':
      return 'selected-color-red';
    case 'green':
      return 'selected-color-green';
    case 'purple':
      return 'selected-color-purple';
    default:
      return '';
  }
});

const isBeingScolled = ref(false);
</script>
<template>
  <label>
    {{ label }}<br />
    <div
      class="rounded-lg text-3xl flex items-center max-h-12 mt-1"
      :class="isBeingScolled ? '' : 'truncate border-2'"
      @touchstart="() => { isBeingScolled = true }"
      @touchend="() => { isBeingScolled = false }"
    >
      <VueScrollPicker
        v-model="value"
        :options="props.options"
        :class="style"
      />
    </div>
  </label>
</template>
<style src="vue-scroll-picker/lib/style.css"></style>
<style>
.selected-color-red .vue-scroll-picker-item-selected {
  color: rgb(153 27 27 / var(--tw-text-opacity));
}
.selected-color-purple .vue-scroll-picker-item-selected {
  color: rgb(91 33 182 / var(--tw-text-opacity));
}
.selected-color-green .vue-scroll-picker-item-selected {
  color: rgb(22 101 52 / var(--tw-text-opacity));
}
</style>
