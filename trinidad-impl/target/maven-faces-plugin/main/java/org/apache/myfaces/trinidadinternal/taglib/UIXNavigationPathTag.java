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

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.UIXNavigationPath;

/**
 * Auto-generated tag class.
 */
abstract public class UIXNavigationPathTag extends UIXCollectionTag
{

  /**
   * Construct an instance of the UIXNavigationPathTag.
   */
  public UIXNavigationPathTag()
  {
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

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    bean.setProperty(UIXNavigationPath.VAR_STATUS_KEY, _varStatus);
    setProperty(bean, UIXNavigationPath.VALUE_KEY, _value);
  }

  @Override
  public void release()
  {
    super.release();
    _varStatus = null;
    _value = null;
  }
}
