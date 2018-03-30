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
import org.apache.myfaces.trinidad.component.UIXSelectRange;
import org.apache.myfaces.trinidad.webapp.UIXComponentTag;

/**
 * Auto-generated tag class.
 */
abstract public class UIXSelectRangeTag extends UIXComponentTag
{

  /**
   * Construct an instance of the UIXSelectRangeTag.
   */
  public UIXSelectRangeTag()
  {
  }

  private String _var;
  final public void setVar(String var)
  {
    _var = var;
  }

  private String _immediate;
  final public void setImmediate(String immediate)
  {
    _immediate = immediate;
  }

  private String _rangeChangeListener;
  final public void setRangeChangeListener(String rangeChangeListener)
  {
    _rangeChangeListener = rangeChangeListener;
  }

  private String _value;
  final public void setValue(String value)
  {
    _value = value;
  }

  private String _rows;
  final public void setRows(String rows)
  {
    _rows = rows;
  }

  private String _first;
  final public void setFirst(String first)
  {
    _first = first;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setBooleanProperty(bean, UIXSelectRange.IMMEDIATE_KEY, _immediate);
    setIntegerProperty(bean, UIXSelectRange.ROWS_KEY, _rows);
    setIntegerProperty(bean, UIXSelectRange.FIRST_KEY, _first);
    if (_rangeChangeListener != null)
    {
      MethodBinding mb = createMethodBinding(_rangeChangeListener, new Class[]{org.apache.myfaces.trinidad.event.RangeChangeEvent.class,});
      bean.setProperty(UIXSelectRange.RANGE_CHANGE_LISTENER_KEY, mb);
    }
    bean.setProperty(UIXSelectRange.VAR_KEY, _var);
    setProperty(bean, UIXSelectRange.VALUE_KEY, _value);
  }

  @Override
  public void release()
  {
    super.release();
    _immediate = null;
    _rows = null;
    _first = null;
    _rangeChangeListener = null;
    _var = null;
    _value = null;
  }
}
