import { defineConfig } from 'vitepress'

// https://vitepress.dev/reference/site-config
export default defineConfig({
  title: "Plasmo Voice",
  description: "Proximity Voice Chat Mod for Minecraft",

  head: [
    ['link', { rel: "icon", href: "/favicon.svg"}],
  ],

  themeConfig: {
    // https://vitepress.dev/reference/default-theme-config
    nav: [
      { text: 'Home', link: '/' },
      { text: 'Documentation', link: '/docs/' }
    ],

    logo: '/logo.svg',

    sidebar: [
      {
        text: "Documentation",
        items: [
          { text: 'Overview', link: '/docs/' },
          { text: 'New in Plasmo Voice 2xx', link: '/docs/new-in-2xx/' },
        ],
      },
      {
        text: 'Server',
        items: [
          { text: 'Installing on a Server', link: '/docs/server/installing/' },
          { text: 'Advanced Theory', link: '/docs/server/advanced/' },
          { text: 'Installing on a Proxy', link: '/docs/server/proxy/' },
          { text: 'DDoS Protection Setup', link: '/docs/server/udp-proxy/' },
          { text: 'Commands and Permissions', link: '/docs/server/commands/' },
          { text: 'Placeholder API', link: '/docs/server/papi/' },
        ]
      },
      // {
      //   text: 'Client',
      //   items: [
      //     { text: 'Inherit Activation Type', link: '/addons.html' },
      //     { text: 'MacOS Microphone Issue', link: '/addon-types.html' },
      //   ]
      // },
      {
        text: 'Add-ons',
        items: [
          { text: 'Add-ons List', link: '/docs/addons/' },
          { text: 'Types of Add-ons', link: '/docs/addons/types/' },
        ]
      },
      {
        text: 'API',
      //   collapsed: true,
        items: [
          { text: 'Getting Started', link: '/docs/api/' },
      //     { text: 'Activations', link: '/addon-types.html' },
      //     { text: 'Source Lines', link: '/addons.html' },
      //     { text: 'Events', link: '/addon-types.html' },
      //     { text: 'Creating Sources', link: '/addons.html' },
      //     { text: 'Encoding and Decoding', link: '/addon-types.html' },
      //     { text: 'Encryption and Decryption', link: '/addons.html' },
      //     { text: 'Sending Packets', link: '/addon-types.html' },
      //     { text: 'Universal Add-on Features', link: '/addon-types.html' },
        ]
      },
    ],

    socialLinks: [
      { icon: 'github', link: 'https://github.com/plasmoapp/plasmo-voice' },
      { icon: 'discord', link: 'https://discord.com/invite/uueEqzwCJJ'},
      {
        icon: {
          svg: `<svg width="512" height="514" viewBox="0 0 512 514" fill="none" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" clip-rule="evenodd" d="M503.16 323.56C514.55 281.47 515.32 235.91 503.2 190.76C466.57 54.2299 326.04 -26.8001 189.33 9.77991C83.8101 38.0199 11.3899 128.07 0.689941 230.47H43.99C54.29 147.33 113.74 74.7298 199.75 51.7098C306.05 23.2598 415.13 80.6699 453.17 181.38L411.03 192.65C391.64 145.8 352.57 111.45 306.3 96.8198L298.56 140.66C335.09 154.13 364.72 184.5 375.56 224.91C391.36 283.8 361.94 344.14 308.56 369.17L320.09 412.16C390.25 383.21 432.4 310.3 422.43 235.14L464.41 223.91C468.91 252.62 467.35 281.16 460.55 308.07L503.16 323.56Z"/>
            <path d="M321.99 504.22C185.27 540.8 44.7501 459.77 8.11011 323.24C3.84011 307.31 1.17 291.33 0 275.46H43.27C44.36 287.37 46.4699 299.35 49.6799 311.29C53.0399 323.8 57.45 335.75 62.79 347.07L101.38 323.92C98.1299 316.42 95.39 308.6 93.21 300.47C69.17 210.87 122.41 118.77 212.13 94.7601C229.13 90.2101 246.23 88.4401 262.93 89.1501L255.19 133C244.73 133.05 234.11 134.42 223.53 137.25C157.31 154.98 118.01 222.95 135.75 289.09C136.85 293.16 138.13 297.13 139.59 300.99L188.94 271.38L174.07 231.95L220.67 184.08L279.57 171.39L296.62 192.38L269.47 219.88L245.79 227.33L228.87 244.72L237.16 267.79C237.16 267.79 253.95 285.63 253.98 285.64L277.7 279.33L294.58 260.79L331.44 249.12L342.42 273.82L304.39 320.45L240.66 340.63L212.08 308.81L162.26 338.7C187.8 367.78 226.2 383.93 266.01 380.56L277.54 423.55C218.13 431.41 160.1 406.82 124.05 361.64L85.6399 384.68C136.25 451.17 223.84 484.11 309.61 461.16C371.35 444.64 419.4 402.56 445.42 349.38L488.06 364.88C457.17 431.16 398.22 483.82 321.99 504.22Z"/>
          </svg>`
        },
        link: 'https://modrinth.com/mod/plasmo-voice'
      },
      {
        icon: {
          svg: `<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 180 180">
            <path d="M108.8135992 26.06720125c-26.468266 0-48.00213212 21.53066613-48.00213212 47.99733213 0 26.38653268 21.53386613 47.85426547 48.00213213 47.85426547 26.38639937 0 47.8530655-21.4677328 47.8530655-47.85426547 0-26.466666-21.46666613-47.99733213-47.85306547-47.99733213"/>
            <path d="M23.333335 153.93333178V26.0666679h23.46666576v127.8666639z"/>
          </svg>`
        },
        link: 'https://www.patreon.com/plasmomc'
      }
    ]
  }
})
