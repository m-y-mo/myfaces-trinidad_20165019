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
package org.apache.myfaces.trinidad.component;

import javax.faces.context.FacesContext;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
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
public class UIXGo extends UIXComponentBase
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey DESTINATION_KEY =
    TYPE.registerKey("destination", String.class);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Go";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Go";

  /**
   * Construct an instance of the UIXGo.
   */
  public UIXGo()
  {
    super("org.apache.myfaces.trinidad.Go");
  }
  	
  /* See ADFFACES-42: switching decode on and off should
   * not be done up here.
  @Override
  void __rendererDecode(FacesContext context)
  {
    // do nothing. we have no behaviour
  }
  */

  /**
   * Gets the URI this go component references
   *
   * @return  the new destination value
   */
  final public String getDestination()
  {
    return ComponentUtils.resolveString(getProperty(DESTINATION_KEY));
  }

  /**
   * Sets the URI this go component references
   * 
   * @param destination  the new destination value
   */
  final public void setDestination(String destination)
  {
    setProperty(DESTINATION_KEY, (destination));
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
   * Construct an instance of the UIXGo.
   */
  protected UIXGo(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Go","org.apache.myfaces.trinidad.Go");
  }
}
