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
import org.apache.myfaces.trinidad.component.UIXTable;

/**
 * Auto-generated tag class.
 */
abstract public class UIXTableTag extends UIXIteratorTag
{

  /**
   * Construct an instance of the UIXTableTag.
   */
  public UIXTableTag()
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

  private String _selectionListener;
  final public void setSelectionListener(String selectionListener)
  {
    _selectionListener = selectionListener;
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

  private String _sortListener;
  final public void setSortListener(String sortListener)
  {
    _sortListener = sortListener;
  }

  private String _rangeChangeListener;
  final public void setRangeChangeListener(String rangeChangeListener)
  {
    _rangeChangeListener = rangeChangeListener;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    if (_rangeChangeListener != null)
    {
      MethodBinding mb = createMethodBinding(_rangeChangeListener, new Class[]{org.apache.myfaces.trinidad.event.RangeChangeEvent.class,});
      bean.setProperty(UIXTable.RANGE_CHANGE_LISTENER_KEY, mb);
    }
    setProperty(bean, UIXTable.DISCLOSED_ROW_KEYS_KEY, _disclosedRowKeys);
    if (_sortListener != null)
    {
      MethodBinding mb = createMethodBinding(_sortListener, new Class[]{org.apache.myfaces.trinidad.event.SortEvent.class,});
      bean.setProperty(UIXTable.SORT_LISTENER_KEY, mb);
    }
    if (_rowDisclosureListener != null)
    {
      MethodBinding mb = createMethodBinding(_rowDisclosureListener, new Class[]{org.apache.myfaces.trinidad.event.RowDisclosureEvent.class,});
      bean.setProperty(UIXTable.ROW_DISCLOSURE_LISTENER_KEY, mb);
    }
    setProperty(bean, UIXTable.SELECTED_ROW_KEYS_KEY, _selectedRowKeys);
    setBooleanProperty(bean, UIXTable.IMMEDIATE_KEY, _immediate);
    if (_selectionListener != null)
    {
      MethodBinding mb = createMethodBinding(_selectionListener, new Class[]{org.apache.myfaces.trinidad.event.SelectionEvent.class,});
      bean.setProperty(UIXTable.SELECTION_LISTENER_KEY, mb);
    }
  }

  @Override
  public void release()
  {
    super.release();
    _rangeChangeListener = null;
    _disclosedRowKeys = null;
    _sortListener = null;
    _rowDisclosureListener = null;
    _selectedRowKeys = null;
    _immediate = null;
    _selectionListener = null;
  }
}
