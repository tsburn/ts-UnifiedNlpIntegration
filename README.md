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

In case you adhered to the above steps and it's still dysfunctional, you're welcome to open an issue.

License
---
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.