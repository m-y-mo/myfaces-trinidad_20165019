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
import org.apache.myfaces.trinidad.component.UIXShowDetail;
import org.apache.myfaces.trinidad.webapp.UIXComponentTag;

/**
 * Auto-generated tag class.
 */
abstract public class UIXShowDetailTag extends UIXComponentTag
{

  /**
   * Construct an instance of the UIXShowDetailTag.
   */
  public UIXShowDetailTag()
  {
  }

  private String _disclosed;
  final public void setDisclosed(String disclosed)
  {
    _disclosed = disclosed;
  }

  private String _disclosedTransient;
  final public void setDisclosedTransient(String disclosedTransient)
  {
    _disclosedTransient = disclosedTransient;
  }

  private String _immediate;
  final public void setImmediate(String immediate)
  {
    _immediate = immediate;
  }

  private String _disclosureListener;
  final public void setDisclosureListener(String disclosureListener)
  {
    _disclosureListener = disclosureListener;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setBooleanProperty(bean, UIXShowDetail.IMMEDIATE_KEY, _immediate);
    setBooleanProperty(bean, UIXShowDetail.DISCLOSED_KEY, _disclosed);
    setBooleanProperty(bean, UIXShowDetail.DISCLOSED_TRANSIENT_KEY, _disclosedTransient);
    if (_disclosureListener != null)
    {
      MethodBinding mb = createMethodBinding(_disclosureListener, new Class[]{org.apache.myfaces.trinidad.event.DisclosureEvent.class,});
      bean.setProperty(UIXShowDetail.DISCLOSURE_LISTENER_KEY, mb);
    }
  }

  @Override
  public void release()
  {
    super.release();
    _immediate = null;
    _disclosed = null;
    _disclosedTransient = null;
    _disclosureListener = null;
  }
}
