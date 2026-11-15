# ChromeVectorUA

Starter project for a Vector / libxposed API 102 module scoped to `com.android.chrome`.

## Build
GitHub Actions runs on pushes to `main` and can also be started manually from **Actions → Build APK → Run workflow**.

The APK is uploaded as the `ChromeVectorUA-debug` artifact.

## Important status
This is currently a **diagnostic starter scaffold only**. It registers the module entry point and logs when the Chrome package is loaded. It does **not** yet change Chrome's User-Agent, User-Agent Client Hints, or Chromium device metadata.

The uploaded `libmonochrome.so` strings alone do not provide verified hook offsets or function signatures. Do not treat this APK as a working UA spoofing module until the Chromium hooks have been reverse-engineered, implemented, built, and tested.
