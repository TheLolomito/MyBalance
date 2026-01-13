# MyBalance (Expo + TypeScript)

Proyecto Expo con TypeScript y navegación por stack usando React Navigation.

## Requisitos

- Node.js LTS
- Expo CLI (instalado vía `npx`)
- Android Studio o un dispositivo físico con la app **Expo Go**

## Instalación

```bash
npm install
```

## Correr en Android

1. Inicia Metro:
   ```bash
   npm run start
   ```
2. Abre el emulador de Android **o** conecta tu dispositivo físico.
3. En la terminal donde corre Expo, presiona `a` para abrir en Android.
   - Alternativa rápida:
     ```bash
     npm run android
     ```
4. Si usas un dispositivo físico, escanea el QR con **Expo Go**.

## Estructura

- `src/`: código de la app (pantallas y navegación).
- `App.tsx`: punto de entrada que carga `src/App.tsx`.
