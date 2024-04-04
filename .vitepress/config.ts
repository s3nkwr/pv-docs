import { defineConfig } from 'vitepress'
import { shared } from "./shared";
import { en } from "./en";
import { ru } from "./ru";

// https://vitepress.dev/reference/site-config
export default defineConfig({
  ...shared,
  locales: {
    root: { label: 'English', ...en },
    ru: { label: 'Русский', ...ru }
  }
})
