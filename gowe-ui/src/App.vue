<script setup lang="ts">
import {RouterView} from 'vue-router'
</script>

<template>
  <h1 class="h1">h</h1>
  <RouterView/>
</template>

<style scoped lang="css">
.h1 {
  @apply text-red-200;
}
</style>
