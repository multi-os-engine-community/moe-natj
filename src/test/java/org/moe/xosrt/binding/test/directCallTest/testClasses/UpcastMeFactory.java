/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.xosrt.binding.test.directCallTest.testClasses;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;

@ObjCClassBinding
@Runtime(ObjCRuntime.class)
public class UpcastMeFactory extends NSObject {
	@Selector("alloc")
    @Owned
    public static native UpcastMeFactory alloc();

    @Selector("init")
    @Generated
    public native UpcastMeFactory init();

	@Selector("createUpcastMeAsObject")
	public static native NSObject createUpcastMeAsObject();

    static {
        NatJ.register();
    }

    protected UpcastMeFactory(Pointer peer) {
		super(peer);
	}
}
