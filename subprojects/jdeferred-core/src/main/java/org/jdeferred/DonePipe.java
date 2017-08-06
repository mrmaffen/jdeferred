/*
 * Copyright 2013-2016 Ray Tsang
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
package org.jdeferred;

/**
 * @param <D>     Type of this {@link DonePipe}'s input
 * @param <D_OUT> Type used for {@link Promise#done(DoneCallback)}
 * @param <F_OUT> Type used for {@link Promise#fail(FailCallback)}
 * @param <P_OUT> Type used for {@link Promise#progress(ProgressCallback)}
 * @author Ray Tsang
 * @see Promise#then(DonePipe, FailPipe)
 * @see Deferred#resolve(Object)
 * @see Deferred#reject(Object)
 * @see Deferred#notify(Object)
 */
public interface DonePipe<D, D_OUT, F_OUT, P_OUT> {

	Promise<D_OUT, F_OUT, P_OUT> pipeDone(final D result);
}
