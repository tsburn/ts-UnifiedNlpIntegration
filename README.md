ts-UnifiedNlpIntegration
-

An Xposed module with the capability to incorporate MicroG Services Core [MicroG UnifiedNlp](https://github.com/microg/android_packages_apps_GmsCore) into the system, even if GAPPS are installed.

All credit to the original developers, and special thanks to the Xposed module community!

Installation
--

1. Download and install `GMSCore.apk` from the UnifiedNlp [release page](https://github.com/microg/android_packages_apps_GmsCore/releases)
2. Download and install one or more [backends](https://github.com/microg/android_packages_apps_UnifiedNlp#usage)
3. Download and install this module
4. Restart your device
5. And, you're all set

### How can you confirm it's working

If you're using the experimental module, you can open the settings and click the "Check settings" button. This will verify if everything is functioning properly.
For any other queries, refer to [#1](https://github.com/Rawi01/XposedUnifiedNlp/issues/1).

### Problem-solving

Make sure that you
* have activated the backends in MicroG Settings
* have enabled network-based geolocation in Settings->Location

In case you ad