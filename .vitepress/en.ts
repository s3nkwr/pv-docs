import { defineConfig, type DefaultTheme } from 'vitepress'

export const en = defineConfig({
    lang: 'en-US',
    description: "Proximity Voice Chat Mod for Minecraft",

    themeConfig: {
        nav: nav(),

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
                    { text: 'Events', link: '/docs/api/events' },
                    { text: 'Activations', link: '/docs/api/activations' },
                    { text: 'Source Lines', link: '/docs/api/source-lines' },
                    { text: 'Sources', link: '/docs/api/sources' },
                    { text: 'Encoding & Encryption', link: '/docs/api/encoding-and-encryption' },
                    { text: 'Languages', link: '/docs/api/languages' },
                    { text: 'Dokka', link: 'https://dokka.plasmovoice.com' }
                    //     { text: 'Encoding and Decoding', link: '/addon-types.html' },
                    //     { text: 'Encryption and Decryption', link: '/addons.html' },
                    //     { text: 'Sending Packets', link: '/addon-types.html' },
                    //     { text: 'Universal Add-on Features', link: '/addon-types.html' },
                ]
            },
        ],

        footer: {
            message: 'Released under the MIT License.',
            copyright: 'Copyright © 2019-present Evan You'
        }
    }
})

function nav(): DefaultTheme.NavItem[] {
    return [
        { text: 'Home', link: '/' },
        { text: 'Documentation', link: '/docs/' }
    ]
}