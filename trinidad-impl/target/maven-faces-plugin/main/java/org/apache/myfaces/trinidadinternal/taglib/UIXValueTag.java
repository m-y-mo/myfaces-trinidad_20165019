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
package org.apache.myfaces.trinidadinternal.taglib;

import javax.faces.convert.Converter;
import javax.faces.el.ValueBinding;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.UIXValue;
import org.apache.myfaces.trinidad.webapp.UIXComponentTag;

/**
 * Auto-generated tag class.
 */
abstract public class UIXValueTag extends UIXComponentTag
{

  /**
   * Construct an instance of the UIXValueTag.
   */
  public UIXValueTag()
  {
  }

  private String _value;
  final public void setValue(String value)
  {
    _value = value;
  }

  private String _converter;
  final public void setConverter(String converter)
  {
    _converter = converter;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, UIXValue.VALUE_KEY, _value);
    if (_converter != null)
    {
      if (isValueReference(_converter))
      {
        ValueBinding vb = createValueBinding(_converter);
        bean.setValueBinding(UIXValue.CONVERTER_KEY, vb);
      }
      else
      {
        Converter converter = getFacesContext().getApplication().
          createConverter(_converter);
        bean.setProperty(UIXValue.CONVERTER_KEY, converter);
      }
    }
  }

  @Override
  public void release()
  {
    super.release();
    _value = null;
    _converter = null;
  }
}
