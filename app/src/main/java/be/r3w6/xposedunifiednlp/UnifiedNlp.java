package be.r3w6.xposedunifiednlp;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

import android.content.res.XResources;
import android.os.Build;
import android.os.UserHandle;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class UnifiedNlp implements IXposedHookZygoteInit, IXposedHookLoadPackage {

    @Override
    public v