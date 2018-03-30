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

import javax.faces.component.NamingContainer;
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
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXDecorateCollection extends UIXComponentBase
                                   implements NamingContainer
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.DecorateCollection";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.DecorateCollection";

  /**
   * Construct an instance of the UIXDecorateCollection.
   */
  public UIXDecorateCollection()
  {
    super("org.apache.myfaces.trinidad.DecorateCollection");
  }
    /**
   * Gets the currency String for this decorate collection.
   * @return the current established currency
   * @see #setCurrencyString
   */
  public String getCurrencyString()
  {
    return _currencyString;
  }

  /**
   * Sets the currency String for this decorate collection. The decorator renders
   * aggregated components that are not in the component tree. If any of the aggregated
   * component is a naming container (for e.g. menubar), this method allows the currency to
   * be set to that naming container so that it can successfully decode its children.
   *
   * @param currency the currency to be established
   * @see #getCurrencyString
   */
  public void setCurrencyString(String currency)
  {
    _currencyString = currency;
  }

  /**
   * Gets the client-id of this component, without any NamingContainers.
   * This id changes depending on the currency Object.
   * Because this implementation uses currency strings, the local client ID is
   * not stable for very long. Its lifetime is the same as that of a
   * currency string.
   * @see #getCurrencyString
   * @return the local clientId
   */
  @Override
  protected final String getLocalClientId()
  {
    String id = super.getLocalClientId();
    String key = getCurrencyString();
    if (key != null)
    {
      StringBuilder bld = __getSharedStringBuilder();
      bld.append(id).append(NamingContainer.SEPARATOR_CHAR).append(key);
      id = bld.toString();
    }

    return id;
  }

  private String _currencyString = null;

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
   * Construct an instance of the UIXDecorateCollection.
   */
  protected UIXDecorateCollection(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.DecorateCollection","org.apache.myfaces.trinidad.DecorateCollection");
  }
}
