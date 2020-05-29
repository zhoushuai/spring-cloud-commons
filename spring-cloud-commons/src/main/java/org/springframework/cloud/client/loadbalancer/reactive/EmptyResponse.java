/*
 * Copyright 2012-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.client.loadbalancer.reactive;

import org.springframework.cloud.client.ServiceInstance;

/**
 * A {@link Response} with no selected {@link ServiceInstance}.
 *
 * @author Spencer Gibb
 * @author Olga Maciaszek-Sharma
 */
public class EmptyResponse implements Response<ServiceInstance> {

	private CompletionContext completionContext;

	@Override
	public boolean hasServer() {
		return false;
	}

	@Override
	public ServiceInstance getServer() {
		return null;
	}

	@Override
	public void onComplete(CompletionContext completionContext) {
		this.completionContext = completionContext;
	}

	@Override
	public CompletionContext getCompletionContext() {
		return completionContext;
	}

}
