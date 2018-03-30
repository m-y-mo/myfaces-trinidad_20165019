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
import org.apache.myfaces.trinidad.component.UIXTree;

/**
 * Auto-generated tag class.
 */
abstract public class UIXTreeTag extends UIXCollectionTag
{

  /**
   * Construct an instance of the UIXTreeTag.
   */
  public UIXTreeTag()
  {
  }

  private String _selectedRowKeys;
  final public void setSelectedRowKeys(String selectedRowKeys)
  {
    _selectedRowKeys = selectedRowKeys;
  }

  private String _immediate;
  final public void setImmediate(String immediate)
  {
    _immediate = immediate;
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

  private String _selectionListener;
  final public void setSelectionListener(String selectionListener)
  {
    _selectionListener = selectionListener;
  }

  private String _varStatus;
  final public void setVarStatus(String varStatus)
  {
    _varStatus = varStatus;
  }

  private String _value;
  final public void setValue(String value)
  {
    _value = value;
  }

  private String _focusRowKey;
  final public void setFocusRowKey(String focusRowKey)
  {
    _focusRowKey = focusRowKey;
  }

  private String _focusListener;
  final public void setFocusListener(String focusListener)
  {
    _focusListener = focusListener;
  }

  private String _initiallyExpanded;
  final public void setInitiallyExpanded(String initiallyExpanded)
  {
    _initiallyExpanded = initiallyExpanded;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    if (_focusListener != null)
    {
      MethodBinding mb = createMethodBinding(_focusListener, new Class[]{org.apache.myfaces.trinidad.event.FocusEvent.class,});
      bean.setProperty(UIXTree.FOCUS_LISTENER_KEY, mb);
    }
    setBooleanProperty(bean, UIXTree.INITIALLY_EXPANDED_KEY, _initiallyExpanded);
    setProperty(bean, UIXTree.VALUE_KEY, _value);
    setProperty(bean, UIXTree.FOCUS_ROW_KEY_KEY, _focusRowKey);
    if (_selectionListener != null)
    {
      MethodBinding mb = createMethodBinding(_selectionListener, new Class[]{org.apache.myfaces.trinidad.event.SelectionEvent.class,});
      bean.setProperty(UIXTree.SELECTION_LISTENER_KEY, mb);
    }
    setBooleanProperty(bean, UIXTree.IMMEDIATE_KEY, _immediate);
    setProperty(bean, UIXTree.SELECTED_ROW_KEYS_KEY, _selectedRowKeys);
    if (_rowDisclosureListener != null)
    {
      MethodBinding mb = createMethodBinding(_rowDisclosureListener, new Class[]{org.apache.myfaces.trinidad.event.RowDisclosureEvent.class,});
      bean.setProperty(UIXTree.ROW_DISCLOSURE_LISTENER_KEY, mb);
    }
    setProperty(bean, UIXTree.DISCLOSED_ROW_KEYS_KEY, _disclosedRowKeys);
    bean.setProperty(UIXTree.VAR_STATUS_KEY, _varStatus);
  }

  @Override
  public void release()
  {
    super.release();
    _focusListener = null;
    _initiallyExpanded = null;
    _value = null;
    _focusRowKey = null;
    _selectionListener = null;
    _immediate = null;
    _selectedRowKeys = null;
    _rowDisclosureListener = null;
    _disclosedRowKeys = null;
    _varStatus = null;
  }
}
