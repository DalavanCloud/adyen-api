/*
 * Copyright 2015 Willian Oki
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
 * 
 */
package com.adyen.payment.api.error;

/**
 * Helper class for implementing exception classes which are capable of holding
 * nested exceptions. Necessary because we can't share a base class among
 * different exception types.
 * 
 * <p>
 * Note: 'direct inspiration' from Spring/Core. Used here to avoid dependecy on
 * spring-core.
 * </p>
 * 
 * @author Willian Oki &lt;willian.oki@gmail.com&gt;
 */
public class NestedExceptionUtils {
	/**
	 * Build a message for the given base message and root cause.
	 * 
	 * @param message
	 *            the base message
	 * @param cause
	 *            the root cause
	 * @return the full exception message
	 */
	public static String buildMessage(String message, Throwable cause) {
		if (cause != null) {
			StringBuilder sb = new StringBuilder();
			if (message != null) {
				sb.append(message).append("; ");
			}
			sb.append("nested exception is ").append(cause);
			return sb.toString();
		} else {
			return message;
		}
	}
}
