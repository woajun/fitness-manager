<script lang="ts" setup>
const props = defineProps<{
  type:'left-cramps' | 'right-cramps'
}>();
</script>
<template>
  <svg
    v-if="props.type === 'left-cramps'"
    xmlns="http://www.w3.org/2000/svg"
    class="icon icon-tabler icon-tabler-chevron-left"
    width="24"
    height="24"
    viewBox="0 0 24 24"
    stroke-width="1.5"
    stroke="currentColor"
    fill="none"
    stroke-linecap="round"
    stroke-linejoin="round"
  >
    <path stroke="none" d="M0 0h24v24H0z" fill="none" />
    <polyline points="15 6 9 12 15 18" />
  </svg>
  <svg
    v-else-if="props.type === 'right-cramps'"
    xmlns="http://www.w3.org/2000/svg"
    class="icon icon-tabler icon-tabler-chevron-right"
    width="24"
    height="24"
    viewBox="0 0 24 24"
    stroke-width="1.5"
    stroke="currentColor"
    fill="none"
    stroke-linecap="round"
    stroke-linejoin="round"
  >
    <path stroke="none" d="M0 0h24v24H0z" fill="none" />
    <polyline points="9 6 15 12 9 18" />
  </svg>
</template>
