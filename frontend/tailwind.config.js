/** @type {import('tailwindcss').Config} */
export default {
  content: ['./src/**/*.{js,jsx,ts,tsx}'],
  theme: {
    extend: {
      keyframes: {
        fadeIn: {
          '0%': { opacity: '0' },
          '100%': { opacity: '1' },
        },
      },
      animation: {
        fadeIn1: 'fadeIn 1s ease-in-out',
        fadeIn2: 'fadeIn 2s ease-in-out',
      },
    },
  },
  plugins: [],
}

