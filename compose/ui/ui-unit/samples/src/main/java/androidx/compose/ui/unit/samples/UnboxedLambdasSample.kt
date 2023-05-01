/*
 * Copyright 2023 The Android Open Source Project
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

@file:Suppress("UNUSED_PARAMETER")

package androidx.compose.ui.unit.samples

import androidx.annotation.Sampled
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.DoubleLambda
import androidx.compose.ui.unit.FloatLambda
import androidx.compose.ui.unit.IntLambda
import androidx.compose.ui.unit.LongLambda
import androidx.compose.ui.unit.ShortLambda

@Sampled
@Composable
fun FloatLambdaSample() {
    @Composable
    fun UseAsArg(param: FloatLambda) {
        // param does not box
    }
    UseAsArg { 1.0f }
}

@Sampled
@Composable
fun DoubleLambdaSample() {
    @Composable
    fun UseAsArg(param: DoubleLambda) {
        // param does not box
    }
    UseAsArg { 1.0 }
}

@Sampled
@Composable
fun IntLambdaSample() {
    @Composable
    fun UseAsArg(param: IntLambda) {
        // param does not box
    }
    UseAsArg { 1 }
}

@Sampled
@Composable
fun LongLambdaSample() {
    @Composable
    fun UseAsArg(param: LongLambda) {
        // param does not box
    }
    UseAsArg { 1L }
}

@Sampled
@Composable
fun ShortLambdaSample() {
    @Composable
    fun UseAsArg(param: ShortLambda) {
        // param does not box
    }
    UseAsArg { 1.toShort() }
}