/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wicket_sapporo.workshop01.page.template.childtag_pattern;

import java.util.Date;

import org.apache.wicket.datetime.markup.html.basic.DateLabel;
import org.apache.wicket.model.Model;

/**
 * 主にコンテンツなどを表示するページの例2.
 *
 * @author Hiroto Yamakawa
 */
public class Content02Page extends MenuPage {
	private static final long serialVersionUID = -3206535468355196931L;

	public Content02Page() {
		// Content01Page同様、下は、時分秒を表示するための DateLabel の例です。
		add(DateLabel.forDatePattern("dateLabel", Model.of(new Date()), "HH:mm:ss"));
	}

}
