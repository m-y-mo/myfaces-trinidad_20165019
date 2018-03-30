// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
package org.apache.myfaces.trinidad.component.html;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXComponentBase;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <html:p>
 * 	    The	script component supports both the importing of	libraries and
 * 	    inline scripts.
 * 	  </html:p>
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class HtmlScript extends UIXComponentBase
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey TEXT_KEY =
    TYPE.registerKey("text", String.class);
  static public final PropertyKey SOURCE_KEY =
    TYPE.registerKey("source", String.class);
  static public final PropertyKey GENERATES_CONTENT_KEY =
    TYPE.registerKey("generatesContent", Boolean.class, Boolean.FALSE);
  static public final PropertyKey PARTIAL_TRIGGERS_KEY =
    TYPE.registerKey("partialTriggers", String[].class);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Script";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.HtmlScript";

  /**
   * Construct an instance of the HtmlScript.
   */
  public HtmlScript()
  {
    super("org.apache.myfaces.trinidad.Script");
  }

  /**
   * Gets the	inline script
   *
   * @return  the new text value
   */
  final public String getText()
  {
    return ComponentUtils.resolveString(getProperty(TEXT_KEY));
  }

  /**
   * Sets the	inline script
   * 
   * @param text  the new text value
   */
  final public void setText(String text)
  {
    setProperty(TEXT_KEY, (text));
  }

  /**
   * Gets the	URI of a script	library	to import.
   *
   * @return  the new source value
   */
  final public String getSource()
  {
    return ComponentUtils.resolveString(getProperty(SOURCE_KEY));
  }

  /**
   * Sets the	URI of a script	library	to import.
   * 
   * @param source  the new source value
   */
  final public void setSource(String source)
  {
    setProperty(SOURCE_KEY, (source));
  }

  /**
   * Gets if the script generates content
   * 	    using document.write() or document.writeln(), set this to true.
   * 	    It defaults	to false.
   *
   * @return  the new generatesContent value
   */
  final public boolean isGeneratesContent()
  {
    return ComponentUtils.resolveBoolean(getProperty(GENERATES_CONTENT_KEY), false);
  }

  /**
   * Sets if the script generates content
   * 	    using document.write() or document.writeln(), set this to true.
   * 	    It defaults	to false.
   * 
   * @param generatesContent  the new generatesContent value
   */
  final public void setGeneratesContent(boolean generatesContent)
  {
    setProperty(GENERATES_CONTENT_KEY, generatesContent ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets the	IDs of the components that should trigger a partial update.
   * 	 This component	will listen on the trigger components. If one of the
   * 	 trigger components receives an	event that will	cause it to update
   * 	 in some way, this component will request to be	updated	too.
   *
   * @return  the new partialTriggers value
   */
  final public String[] getPartialTriggers()
  {
    return (String[])getProperty(PARTIAL_TRIGGERS_KEY);
  }

  /**
   * Sets the	IDs of the components that should trigger a partial update.
   * 	 This component	will listen on the trigger components. If one of the
   * 	 trigger components receives an	event that will	cause it to update
   * 	 in some way, this component will request to be	updated	too.
   * 
   * @param partialTriggers  the new partialTriggers value
   */
  final public void setPartialTriggers(String[] partialTriggers)
  {
    setProperty(PARTIAL_TRIGGERS_KEY, (partialTriggers));
  }

  @Override
  public String getFamily()
  {
    return COMPONENT_FAMILY;
  }

  @Override
  protected FacesBean.Type getBeanType()
  {
    return TYPE;
  }

  /**
   * Construct an instance of the HtmlScript.
   */
  protected HtmlScript(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Script","org.apache.myfaces.trinidad.Script");
  }
}
