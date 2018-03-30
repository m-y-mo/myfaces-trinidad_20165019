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
import org.apache.myfaces.trinidad.component.UIXProgress;
import org.apache.myfaces.trinidad.webapp.UIXComponentTag;

/**
 * Auto-generated tag class.
 */
abstract public class UIXProgressTag extends UIXComponentTag
{

  /**
   * Construct an instance of the UIXProgressTag.
   */
  public UIXProgressTag()
  {
  }

  private String _value;
  final public void setValue(String value)
  {
    _value = value;
  }

  private String _action;
  final public void setAction(String action)
  {
    _action = action;
  }

  private String _actionListener;
  final public void setActionListener(String actionListener)
  {
    _actionListener = actionListener;
  }

  private String _immediate;
  final public void setImmediate(String immediate)
  {
    _immediate = immediate;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setBooleanProperty(bean, UIXProgress.IMMEDIATE_KEY, _immediate);
    if (_actionListener != null)
    {
      MethodBinding mb = createMethodBinding(_actionListener, new Class[]{javax.faces.event.ActionEvent.class,});
      bean.setProperty(UIXProgress.ACTION_LISTENER_KEY, mb);
    }
    setProperty(bean, UIXProgress.VALUE_KEY, _value);
    if (_action != null)
    {
      MethodBinding mb;
      if (isValueReference(_action))
        mb = createMethodBinding(_action, new Class[0]);
      else
        mb = new org.apache.myfaces.trinidadinternal.taglib.ConstantMethodBinding(_action);
      bean.setProperty(UIXProgress.ACTION_KEY, mb);
    }
  }

  @Override
  public void release()
  {
    super.release();
    _immediate = null;
    _actionListener = null;
    _value = null;
    _action = null;
  }
}
