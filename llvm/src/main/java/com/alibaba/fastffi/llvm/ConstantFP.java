/*
 * Copyright 1999-2021 Alibaba Group Holding Ltd.
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
package com.alibaba.fastffi.llvm;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIExpr;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFITypeAlias;

@FFIGen
@CXXHead("llvm/IR/Constants.h")
@FFITypeAlias("llvm::ConstantFP")
public interface ConstantFP extends ConstantData {

    static boolean isa(Value value) {
        return ValueCasting.INSTANCE.isa(value, (ConstantFP) null);
    }

    static ConstantFP cast(Value value) {
        return null; // ValueCasting.INSTANCE.cast(value, (ConstantFP) null);
    }

    static ConstantFP dyn_cast(Value value) {
        return null; // ValueCasting.INSTANCE.dyn_cast(value, (ConstantFP) null);
    }

    @FFIExpr("{0}->getValue().convertToFloat()")
    float getFloat();

    @FFIExpr("{0}->getValue().convertToDouble()")
    double getDouble();
}
