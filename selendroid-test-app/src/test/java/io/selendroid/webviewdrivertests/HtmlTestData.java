/*
 * Copyright 2012-2013 eBay Software Foundation and selendroid committers.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.selendroid.webviewdrivertests;



public interface HtmlTestData {
  public static final String SAY_HELLO_DEMO = "http://localhost:4450/";
  public static final String XHTML_TEST_PAGE = "file:///android_asset/web/xhtmlTest.html";
  public static final String FORM_PAGE = "file:///android_asset/web/formPage.html";
  public static final String SELECTABLE_ITEMS_PAGE =
      "file:///android_asset/web/selectableItems.html";
  public static final String NESTED_PAGE = "file:///android_asset/web/nestedElements.html";
  public static final String JAVASCRIPT_PAGE = "file:///android_asset/web/javascriptPage.html";
  public static final String MISSED_JS_REFERENCE_PAGE =
      "file:///android_asset/web/missedJsReference.html";
  public static final String ACTUAL_XHTML_PAGE = "file:///android_asset/web/actualXhtmlPage.xhtml";
  public static final String ABOUT_BLANK = "about:blank";
}
