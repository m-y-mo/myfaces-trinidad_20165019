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
package org.apache.myfaces.trinidad.component.core;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.UIXSubform;

/**
 *
 * <html:p>
 * The CoreSubform represents an independently submittable
 * region of a page.  The contents of a subform will only be validated
 * (or otherwise processed) if a component inside of the subform is
 * responsible for submitting the page or if the default attribute is set to true. This allows for comparatively
 * fine-grained control of which components will be validated and pushed
 * into the model without the compromises of using entirely separate form
 * elements.
 * </html:p>
 * 
 * <html:p>
 * We strongly recommend the use of a single &lt;tr:form&gt; per page, and
 * using &lt;tr:subform&gt; where you might otherwise be tempted to use multiple
 * forms.  Multiple forms require multiple copies of page state, and user
 * edits in forms that aren't submitted are always lost.  When a page using
 * subforms is submitted, page state is only written once, and all
 * user edits are preserved.
 * </html:p>
 * <html:p>
 * See the UIXSubform Javadoc for more details on how subforms work.
 * </html:p>
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class CoreSubform extends UIXSubform
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXSubform.TYPE);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Subform";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreSubform";

  /**
   * Construct an instance of the CoreSubform.
   */
  public CoreSubform()
  {
    super("org.apache.myfaces.trinidad.Subform");
  }

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
   * Construct an instance of the CoreSubform.
   */
  protected CoreSubform(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Subform","org.apache.myfaces.trinidad.Subform");
  }
}
