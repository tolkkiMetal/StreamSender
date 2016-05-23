/*
 * Copyright (C) 2016 Neo Visionaries Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.polito.mad.streamsender.net.ws;


class CounterPayloadGenerator implements PayloadGenerator
{
    private long mCount;


    @Override
    public byte[] generate()
    {
        return Misc.getBytesUTF8(String.valueOf(increment()));
    }


    private long increment()
    {
        // Increment the counter.
        mCount = Math.max(mCount + 1, 1);

        return mCount;
    }
}