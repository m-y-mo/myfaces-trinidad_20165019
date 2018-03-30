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

import javax.faces.el.MethodBinding;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.UIXEditableValue;

/**
 * Auto-generated tag class.
 */
abstract public class UIXEditableValueTag extends UIXValueTag
{

  /**
   * Construct an instance of the UIXEditableValueTag.
   */
  public UIXEditableValueTag()
  {
  }

  private String _immediate;
  final public void setImmediate(String immediate)
  {
    _immediate = immediate;
  }

  private String _required;
  final public void setRequired(String required)
  {
    _required = required;
  }

  private String _validator;
  final public void setValidator(String validator)
  {
    _validator = validator;
  }

  private String _valueChangeListener;
  final public void setValueChangeListener(String valueChangeListener)
  {
    _valueChangeListener = valueChangeListener;
  }

  private String _requiredMessageDetail;
  final public void setRequiredMessageDetail(String requiredMessageDetail)
  {
    _requiredMessageDetail = requiredMessageDetail;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    if (_valueChangeListener != null)
    {
      MethodBinding mb = createMethodBinding(_valueChangeListener, new Class[]{javax.faces.event.ValueChangeEvent.class,});
      bean.setProperty(UIXEditableValue.VALUE_CHANGE_LISTENER_KEY, mb);
    }
    setProperty(bean, UIXEditableValue.REQUIRED_MESSAGE_DETAIL_KEY, _requiredMessageDetail);
    if (_validator != null)
    {
      MethodBinding mb = createMethodBinding(_validator, new Class[]{javax.faces.context.FacesContext.class,javax.faces.component.UIComponent.class,java.lang.Object.class,});
      bean.setProperty(UIXEditableValue.VALIDATOR_KEY, mb);
    }
    setBooleanProperty(bean, UIXEditableValue.IMMEDIATE_KEY, _immediate);
    setBooleanProperty(bean, UIXEditableValue.REQUIRED_KEY, _required);
  }

  @Override
  public void release()
  {
    super.release();
    _valueChangeListener = null;
    _requiredMessageDetail = null;
    _validator = null;
    _immediate = null;
    _required = null;
  }
}
