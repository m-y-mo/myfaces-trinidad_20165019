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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.faces.context.FacesContext;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.logging.TrinidadLogger;

/**
 *
 * UIXSelectMany is a base abstraction for 
 *           components that allow selection of multiple of a
 *     series of selectItem controls, where order
 *           is not relevant.
 *           selectOne controls may contain any number of
 *           &lt;f:selectItem&gt;, &lt;f:selectItems&gt;, or
 *     &lt;tr:selectItem&gt; components.
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
public class UIXSelectMany extends UIXEditableValue
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXEditableValue.TYPE);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.SelectMany";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.SelectMany";

  /**
   * Construct an instance of the UIXSelectMany.
   */
  public UIXSelectMany()
  {
    super("org.apache.myfaces.trinidad.Listbox");
  }
  

  static public final String REQUIRED_MESSAGE_ID =
    "org.apache.myfaces.trinidad.UIXSelectMany.REQUIRED";
  static public final String UNSUPPORTED_MODEL_TYPE_MESSAGE_ID =
    "org.apache.myfaces.trinidad.UIXSelectMany.UNSUPPORTED_MODEL_TYPE";


  /**
   * Compares two values, disregarding the order of the elements.
   */
  // TODO walk through UIXSelectItem values to determine that new
  //       values are permitted
  @Override
  protected void validateValue(FacesContext context, Object newValue)
  {
    super.validateValue(context, newValue);
  }

  @Override
  protected boolean isEmpty(Object value)
  {
    if (value == null)
      return true;

    if (value instanceof Collection)
      return ((Collection) value).isEmpty();

    if (value.getClass().isArray())
      return Array.getLength(value) == 0;

    return false;
  }

  @Override
  protected String getRequiredMessageKey()
  {
    return REQUIRED_MESSAGE_ID;
  }

  /**
   * @return true if the values are different
   */
  // TODO improve efficiency
  @Override
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

    List<Object> prevList = __toList(previous);
    List<Object> newList = __toList(value);
    return _destructiveCompareOutOfOrderLists(prevList, newList);
  }

  //
  // Return the size of each list
  //
  static int __getSize(Object o)
  {
    if (o == null)
      return 0;

    if (o instanceof Collection)
      return ((Collection) o).size();

    if (o.getClass().isArray())
      return Array.getLength(o);

    if (_LOG.isFine())
      _LOG.fine("Type " + o.getClass() +
                " is not a supported List model type");
    return 0;
  }

  //
  // Compare two Lists in an order-independent fashion, possibly
  // mutating one or the other list.
  //
  static private boolean _destructiveCompareOutOfOrderLists(
    List<Object> one,
    List<Object> two)
  {
    int size = one.size();

    // Assert the two sizes are the same, since we should
    // have eliminated that possibility earlier
    assert(one.size() == two.size());

    for (int i = 0; i < size; i++)
    {
      Object o = one.get(i);
      int indexOf = two.indexOf(o);
      if (indexOf < 0)
        return true;

      two.remove(indexOf);
    }

    return false;
  }

  //
  // Convert an Object to a mutable, copied List;  copied
  // because our compare routine is destructive.
  //
  @SuppressWarnings("unchecked")
  static List<Object> __toList(Object o)
  {
    if (o == null)
      return null;

    ArrayList<Object> listCopy = new ArrayList<Object>();
    if (o instanceof Collection)
    {
      listCopy.addAll((Collection<Object>) o);
    }
    // Use java.lang.reflect.Array, etc. to support primitive Object arrays
    else if (o.getClass().isArray())
    {
      int length = Array.getLength(o);
      listCopy.ensureCapacity(length);
      for (int i = 0; i < length; i++)
      {
        listCopy.add(Array.get(o, i));
      }
    }
    else
    {
      // Already logged in __getSize(), so let it slide here
      ;
    }

    return listCopy;
  }

  static private final TrinidadLogger _LOG = TrinidadLogger.createTrinidadLogger(UIXSelectMany.class);

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
   * Construct an instance of the UIXSelectMany.
   */
  protected UIXSelectMany(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.SelectMany","org.apache.myfaces.trinidad.Listbox");
  }
}
