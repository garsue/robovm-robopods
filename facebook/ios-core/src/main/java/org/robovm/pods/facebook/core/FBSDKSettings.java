/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.facebook.core;

import java.util.Set;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.annotation.MachineSizedFloat;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKSettingsPtr extends Ptr<FBSDKSettings, FBSDKSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKSettings() {}
    protected FBSDKSettings(long handle) { super(handle); }
    protected FBSDKSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "appID")
    public static native String getAppID();
    @Method(selector = "setAppID:")
    public static native void setAppID(String appID);
    @Method(selector = "appURLSchemeSuffix")
    public static native String getAppURLSchemeSuffix();
    @Method(selector = "setAppURLSchemeSuffix:")
    public static native void setAppURLSchemeSuffix(String appURLSchemeSuffix);
    @Method(selector = "clientToken")
    public static native String getClientToken();
    @Method(selector = "setClientToken:")
    public static native void setClientToken(String clientToken);
    @Method(selector = "setGraphErrorRecoveryDisabled:")
    public static native void setGraphErrorRecoveryDisabled(boolean disableGraphErrorRecovery);
    @Method(selector = "displayName")
    public static native String getDisplayName();
    @Method(selector = "setDisplayName:")
    public static native void setDisplayName(String displayName);
    @Method(selector = "facebookDomainPart")
    public static native String getFacebookDomainPart();
    @Method(selector = "setFacebookDomainPart:")
    public static native void setFacebookDomainPart(String facebookDomainPart);
    @Method(selector = "JPEGCompressionQuality")
    public static native @MachineSizedFloat double getJPEGCompressionQuality();
    @Method(selector = "setJPEGCompressionQuality:")
    public static native void setJPEGCompressionQuality(@MachineSizedFloat double JPEGCompressionQuality);
    @Method(selector = "limitEventAndDataUsage")
    public static native boolean limitsEventAndDataUsage();
    @Method(selector = "setLimitEventAndDataUsage:")
    public static native void setLimitEventAndDataUsage(boolean limitEventAndDataUsage);
    @Method(selector = "sdkVersion")
    public static native String getSdkVersion();
    @Method(selector = "loggingBehavior")
    public static native @org.robovm.rt.bro.annotation.Marshaler(FBSDKLoggingBehavior.AsSetMarshaler.class) Set<FBSDKLoggingBehavior> getLoggingBehavior();
    @Method(selector = "setLoggingBehavior:")
    public static native void setLoggingBehavior(@org.robovm.rt.bro.annotation.Marshaler(FBSDKLoggingBehavior.AsSetMarshaler.class) Set<FBSDKLoggingBehavior> loggingBehavior);
    @Method(selector = "enableLoggingBehavior:")
    public static native void enableLoggingBehavior(FBSDKLoggingBehavior loggingBehavior);
    @Method(selector = "disableLoggingBehavior:")
    public static native void disableLoggingBehavior(FBSDKLoggingBehavior loggingBehavior);
    @Method(selector = "setLegacyUserDefaultTokenInformationKeyName:")
    public static native void setLegacyUserDefaultTokenInformationKeyName(String tokenInformationKeyName);
    @Method(selector = "legacyUserDefaultTokenInformationKeyName")
    public static native String getLegacyUserDefaultTokenInformationKeyName();
    /*</methods>*/
}
