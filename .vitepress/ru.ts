import { defineConfig, type DefaultTheme } from 'vitepress'

export const ru = defineConfig({
    lang: 'ru-RU',
    description: "Мод на голосовой чат для Minecraft",

    themeConfig: {
        nav: nav(),

        sidebar: [
            {
                text: "Документация",
                items: [
                    { text: 'Обзор', link: '/ru/docs/' },
                    { text: 'Новое в Plasmo Voice 2xx', link: '/ru/docs/new-in-2xx/' },
                ],
            },
            {
                text: 'Сервер',
                items: [
                    { text: 'Установка на сервер', link: '/ru/docs/server/installing/' },
                    { text: 'Расширенная теория', link: '/ru/docs/server/advanced/' },
                    { text: 'Установка на сервер', link: '/ru/docs/server/proxy/' },
                    { text: 'Установка ДДоС защиты', link: '/ru/docs/server/udp-proxy/' },
                    { text: 'Команды и разрешения', link: '/ru/docs/server/commands/' },
                    { text: 'Placeholder API', link: '/ru/docs/server/papi/' },
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
                text: 'Аддоны',
                items: [
                    { text: 'Список аддонов', link: '/ru/docs/addons/' },
                    { text: 'Типы аддонов', link: '/ru/docs/addons/types/' },
                ]
            },
            {
                text: 'API',
                //   collapsed: true,
                items: [
                    { text: 'Getting Started', link: '/ru/docs/api/' },
                    { text: 'Events', link: '/ru/docs/api/events' },
                    { text: 'Activations', link: '/ru/docs/api/activations' },
                    { text: 'Source Lines', link: '/ru/docs/api/source-lines' },
                    { text: 'Sources', link: '/ru/docs/api/sources' },
                    { text: 'Encoding & Encryption', link: '/ru/docs/api/encoding-and-encryption' },
                    { text: 'Languages', link: '/ru/docs/api/languages' },
                    { text: 'Dokka', link: 'https://dokka.plasmovoice.com' }
                    //     { text: 'Encoding and Decoding', link: '/addon-types.html' },
                    //     { text: 'Encryption and Decryption', link: '/addons.html' },
                    //     { text: 'Sending Packets', link: '/addon-types.html' },
                    //     { text: 'Universal Add-on Features', link: '/addon-types.html' },
                ]
            },
        ],

        docFooter: {
            prev: 'Предыдущая',
            next: 'Следующая'
        },

        outline: {
            label: 'На этой странице'
        },

        langMenuLabel: 'Изменить язык',
        returnToTopLabel: 'Вернуться к началу',
        sidebarMenuLabel: 'Боковое меню',
        darkModeSwitchLabel: 'Темная тема'
    }
})

function nav(): DefaultTheme.NavItem[] {
    return [
        { text: 'Домой', link: '/ru/' },
        { text: 'Документация', link: '/ru/docs/' }
    ]
}

export const search = {
    ru: {
        translations: {
            button: {
                buttonText: 'Поиск',
                buttonAriaLabel: 'Поиск'
            },
            modal: {
                noResultsScreen: {
                    noResultsText: 'Без результатов'
                },
                footer: {
                    selectText: 'Выбрать',
                    navigateText: 'Просмотр',
                    closeText: 'Закрыть',
                    searchByText: 'Искать по'
                }
            }
        }
    }
}