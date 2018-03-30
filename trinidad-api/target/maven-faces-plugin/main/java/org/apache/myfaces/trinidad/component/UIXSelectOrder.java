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

import java.util.List;
import org.apache.myfaces.trinidad.bean.FacesBean;

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
 * <td valign="top"><code>javax.faces.event.ValueChangeEvent</code></td>
 * <td valign="top" nowrap>Process Validations<br>Apply Request Values</td>
 * <td valign="top">The valueChange event is delivered when the value
                       attribute is changed.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXSelectOrder extends UIXSelectMany
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXSelectMany.TYPE);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.SelectOrder";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.SelectOrder";

  /**
   * Construct an instance of the UIXSelectOrder.
   */
  public UIXSelectOrder()
  {
    super("org.apache.myfaces.trinidad.Shuttle");
  }
  	
  /**
   * Compares two values, paying attention to the order of the elements.
   * @return true if the values are different
   */
  // TODO improve efficiency for the array case?
  @Override
  @SuppressWarnings("unchecked")
  protected boolean compareValues(Object previous, Object value)
  {
    int prevSize = __getSize(previous);
    int newSize = __getSize(value);

    // If the sizes are different, no need to bother with further work
    if (prevSize != newSize)
      return true;

    // If the sizes are the same, and they're empty, we're also done.
    if (prevSize == 0)
      return false;

    List<Object> prevList = (previous instanceof List)
                      ? (List<Object>) previous : __toList(previous);
    List<Object> newList = (value instanceof List)
                      ? (List<Object>) value : __toList(value);

    // Since List has explicit rules about how equals() works, we
    // can just use that method.
    return !prevList.equals(newList);
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
   * Construct an instance of the UIXSelectOrder.
   */
  protected UIXSelectOrder(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.SelectOrder","org.apache.myfaces.trinidad.Shuttle");
  }
}
