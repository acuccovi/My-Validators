/*
 * My Validators
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package io.github.acuccovi.bean;

import io.github.acuccovi.validator.NotOneOf;

public class NotOneOfBean {

	@NotOneOf(options = {"Hello", "World", "Hey Joe!"})
	String value;

	public NotOneOfBean(String value) {

		this.value = value;
	}
}
