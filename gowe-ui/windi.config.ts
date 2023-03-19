import { defineConfig } from 'vite-plugin-windicss'
import animationPlugin from '@windicss/plugin-animations'

export default defineConfig({
  theme: {},
  darkMode: "class",
  plugins: [
    animationPlugin({
      settings: {
        animatedSpeed: 1000,
        heartBeatSpeed: 1000,
        hingeSpeed: 2000,
        bounceInSpeed: 750,
        bounceOutSpeed: 750,
        animationDelaySpeed: 1000
      }
    })
  ]
})
