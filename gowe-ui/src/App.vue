<script setup lang="ts">
import { RouterView } from "vue-router";
import { useDark, useToggle } from "@vueuse/core";

const isDark = useDark();
const toggleDark = useToggle(isDark);
</script>

<template>
  <el-container class="layout-container">
    <el-aside width="200px">
      <el-menu>
        <el-menu-item index="1" @click="$router.push({name:'home'})">首页</el-menu-item>
        <el-menu-item index="2" @click="$router.push({name:'test'})">测试页</el-menu-item>
      </el-menu>
    </el-aside>
    <el-container>
      <el-header height="60px">
        <el-row>
          <el-space>
            <h1 class="h1">这是一个测试页</h1>
            <el-button @click="toggleDark()">黑暗模式</el-button>
          </el-space>
        </el-row>
      </el-header>
      <el-main>
        <RouterView />
      </el-main>
      <el-footer height="40px">
        @2023 gowe
      </el-footer>
    </el-container>
  </el-container>
</template>

<style scoped lang="scss">
.h1 {
  @apply text-red-200;
}
.layout-container {
  @apply min-h-screen;

  .el-aside {
    @apply bg-white dark:bg-blue-800;
  }
}

</style>
