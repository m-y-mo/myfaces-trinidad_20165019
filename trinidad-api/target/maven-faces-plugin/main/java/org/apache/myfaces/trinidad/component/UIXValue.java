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

import javax.faces.component.ValueHolder;
import javax.faces.convert.Converter;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;

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
abstract public class UIXValue extends UIXComponentBase
                               implements ValueHolder
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey VALUE_KEY =
    TYPE.registerKey("value");
  static public final PropertyKey CONVERTER_KEY =
    TYPE.registerKey("converter", Converter.class, PropertyKey.CAP_STATE_HOLDER);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Value";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Value";
    /**
   * Return the locally stored value, ignoring any ValueBinding
   * set for "value".
   */
  public Object getLocalValue()
  {
    PropertyKey key = UIXValue.VALUE_KEY;
    return getFacesBean().getLocalProperty(key);
  }

  /**
   * Gets the value of the component.  If the EL binding
   * for the "value" points to a bean property with a getter but no setter, and
   * this is an editable component, the component will be rendered 
   * in read-only mode.
   *
   * @return  the new value value
   */
  final public Object getValue()
  {
    return getProperty(VALUE_KEY);
  }

  /**
   * Sets the value of the component.  If the EL binding
   * for the "value" points to a bean property with a getter but no setter, and
   * this is an editable component, the component will be rendered 
   * in read-only mode.
   * 
   * @param value  the new value value
   */
  final public void setValue(Object value)
  {
    setProperty(VALUE_KEY, (value));
  }

  /**
   * Gets a converter object
   *
   * @return  the new converter value
   */
  final public Converter getConverter()
  {
    return (Converter)getProperty(CONVERTER_KEY);
  }

  /**
   * Sets a converter object
   * 
   * @param converter  the new converter value
   */
  final public void setConverter(Converter converter)
  {
    setProperty(CONVERTER_KEY, (converter));
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
   * Construct an instance of the UIXValue.
   */
  protected UIXValue(
    String rendererType
    )
  {
    super(rendererType);
  }

  /**
   * Construct an instance of the UIXValue.
   */
  protected UIXValue()
  {
    this(null);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Value","org.apache.myfaces.trinidad.Value");
  }
}
