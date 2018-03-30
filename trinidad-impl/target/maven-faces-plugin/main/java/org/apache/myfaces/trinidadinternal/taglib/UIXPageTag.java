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
import org.apache.myfaces.trinidad.component.UIXPage;

/**
 * Auto-generated tag class.
 */
abstract public class UIXPageTag extends UIXCollectionTag
{

  /**
   * Construct an instance of the UIXPageTag.
   */
  public UIXPageTag()
  {
  }

  private String _rowDisclosureListener;
  final public void setRowDisclosureListener(String rowDisclosureListener)
  {
    _rowDisclosureListener = rowDisclosureListener;
  }

  private String _disclosedRowKeys;
  final public void setDisclosedRowKeys(String disclosedRowKeys)
  {
    _disclosedRowKeys = disclosedRowKeys;
  }

  private String _value;
  final public void setValue(String value)
  {
    _value = value;
  }

  private String _varStatus;
  final public void setVarStatus(String varStatus)
  {
    _varStatus = varStatus;
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
    setProperty(bean, UIXPage.DISCLOSED_ROW_KEYS_KEY, _disclosedRowKeys);
    bean.setProperty(UIXPage.VAR_STATUS_KEY, _varStatus);
    if (_rowDisclosureListener != null)
    {
      MethodBinding mb = createMethodBinding(_rowDisclosureListener, new Class[]{org.apache.myfaces.trinidad.event.RowDisclosureEvent.class,});
      bean.setProperty(UIXPage.ROW_DISCLOSURE_LISTENER_KEY, mb);
    }
    setBooleanProperty(bean, UIXPage.IMMEDIATE_KEY, _immediate);
    setProperty(bean, UIXPage.VALUE_KEY, _value);
  }

  @Override
  public void release()
  {
    super.release();
    _disclosedRowKeys = null;
    _varStatus = null;
    _rowDisclosureListener = null;
    _immediate = null;
    _value = null;
  }
}
