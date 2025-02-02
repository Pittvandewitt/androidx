#!/bin/bash
# Copyright 2024 The Android Open Source Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -e
GRADLEW_LOCATION="$(dirname $0)"/../../gradlew
VERIFICATION_METADATA="$(dirname $0)"/../../gradle/verification-metadata.xml
REPOSITORY_LOCATION="$(dirname $0)"/compose-compiler-snapshot-repository
COMPOSE_CUSTOM_VERSION=99.0.0 $GRADLEW_LOCATION -Dmaven.repo.local=$REPOSITORY_LOCATION -Pandroidx.versionExtraCheckEnabled=false :compose:compiler:compiler:publishToMavenLocal --stacktrace
rm -r $VERIFICATION_METADATA
