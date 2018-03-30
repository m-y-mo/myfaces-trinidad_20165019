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
package org.apache.myfaces.trinidad.component.core.data;

import javax.faces.component.UIComponent;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXTreeTable;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <html:p>
 *           The Trinidad TreeTable is used to display data that is structured in a hierarchical format.
 *           This component displays a hierarchy
 *           in a UI similar to an Trinidad Table, and is more elaborate than the Tree component.
 *           TreeTable supports displaying columns of data per element in the hierarchy.
 *           Unlike the Tree component, TreeTable
 *           only supports single rooted hierarchies. The features of the TreeTable
 *           component include mechanisms for focusing in on subtrees (within the main
 *           tree), as well as expanding and collapsing elements in the hierarchy.
 *         </html:p>
 * 
 *         <html:p>
 *           Like the Table, the TreeTable's children must be Trinidad
 *           Column components. Like the Tree, the TreeTable has a &quot;nodeStamp&quot;
 *           facet which renders the &quot;Object Name&quot; Column.
 * 
 *           The &quot;Object Name&quot; Column contains the primary identifier of an element
 *           in the hierarchy. For example, in an organization chart of employees, the &quot;Object Name&quot;
 *           Column might be the employee name.
 *         </html:p>
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.RowDisclosureEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values<br>Invoke Application</td>
 * <td valign="top">The expansion event is generated for a table when the detail facet of a row is expanded or collapsed. For tree or a treeTable, the expansion
                       event is generated when tree nodes are expanded or collapsed.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.SelectionEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values<br>Invoke Application</td>
 * <td valign="top">The selection event is delivered when the table selection
                       changes.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.FocusEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values<br>Invoke Application</td>
 * <td valign="top">Event delivered when user clicks to focus on (or zoom into) a particular element's subtree of children.
      	        The TreeTable responds to this event by modifying the "focusPath" property appropriately.
      	        Subsequently, any registered FocusListener instances are called.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class CoreTreeTable extends UIXTreeTable
{
  static public final String ROW_SELECTION_NONE = "none";
  static public final String ROW_SELECTION_SINGLE = "single";
  static public final String ROW_SELECTION_MULTIPLE = "multiple";
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXTreeTable.TYPE);
  static public final PropertyKey HORIZONTAL_GRID_VISIBLE_KEY =
    TYPE.registerKey("horizontalGridVisible", Boolean.class, Boolean.TRUE);
  static public final PropertyKey VERTICAL_GRID_VISIBLE_KEY =
    TYPE.registerKey("verticalGridVisible", Boolean.class, Boolean.TRUE);
  static public final PropertyKey EMPTY_TEXT_KEY =
    TYPE.registerKey("emptyText", String.class);
  static public final PropertyKey COLUMN_BANDING_INTERVAL_KEY =
    TYPE.registerKey("columnBandingInterval", Integer.class, Integer.valueOf(0));
  static public final PropertyKey ROW_BANDING_INTERVAL_KEY =
    TYPE.registerKey("rowBandingInterval", Integer.class, Integer.valueOf(0));
  static public final PropertyKey ROW_SELECTION_KEY =
    TYPE.registerKey("rowSelection", String.class, "none");
  static public final PropertyKey AUTO_SUBMIT_KEY =
    TYPE.registerKey("autoSubmit", Boolean.class, Boolean.FALSE);
  static public final PropertyKey WIDTH_KEY =
    TYPE.registerKey("width", String.class);
  static public final PropertyKey SUMMARY_KEY =
    TYPE.registerKey("summary", String.class);
  static public final PropertyKey INLINE_STYLE_KEY =
    TYPE.registerKey("inlineStyle", String.class);
  static public final PropertyKey STYLE_CLASS_KEY =
    TYPE.registerKey("styleClass", String.class);
  static public final PropertyKey SHORT_DESC_KEY =
    TYPE.registerKey("shortDesc", String.class);
  static public final PropertyKey PARTIAL_TRIGGERS_KEY =
    TYPE.registerKey("partialTriggers", String[].class);
  static public final PropertyKey ONCLICK_KEY =
    TYPE.registerKey("onclick", String.class);
  static public final PropertyKey ONDBLCLICK_KEY =
    TYPE.registerKey("ondblclick", String.class);
  static public final PropertyKey ONMOUSEDOWN_KEY =
    TYPE.registerKey("onmousedown", String.class);
  static public final PropertyKey ONMOUSEUP_KEY =
    TYPE.registerKey("onmouseup", String.class);
  static public final PropertyKey ONMOUSEOVER_KEY =
    TYPE.registerKey("onmouseover", String.class);
  static public final PropertyKey ONMOUSEMOVE_KEY =
    TYPE.registerKey("onmousemove", String.class);
  static public final PropertyKey ONMOUSEOUT_KEY =
    TYPE.registerKey("onmouseout", String.class);
  static public final PropertyKey ONKEYPRESS_KEY =
    TYPE.registerKey("onkeypress", String.class);
  static public final PropertyKey ONKEYDOWN_KEY =
    TYPE.registerKey("onkeydown", String.class);
  static public final PropertyKey ONKEYUP_KEY =
    TYPE.registerKey("onkeyup", String.class);
  static public final PropertyKey EXPAND_ALL_ENABLED_KEY =
    TYPE.registerKey("expandAllEnabled", Boolean.class, Boolean.TRUE);
  static public final String FOOTER_FACET = "footer";
  static public final String HEADER_FACET = "header";
  static public final String ACTIONS_FACET = "actions";
  static public final String PATH_STAMP_FACET = "pathStamp";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.TreeTable";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreTreeTable";

  /**
   * Construct an instance of the CoreTreeTable.
   */
  public CoreTreeTable()
  {
    super("org.apache.myfaces.trinidad.TreeTable");
  }

  /**
   * the component used to render the table footer.
   */
  final public UIComponent getFooter()
  {
    return getFacet(FOOTER_FACET);
  }

  /**
   * the component used to render the table footer.
   */
  @SuppressWarnings("unchecked")
  final public void setFooter(UIComponent footerFacet)
  {
    getFacets().put(FOOTER_FACET, footerFacet);
  }

  /**
   * the component used to render the table header.
   */
  final public UIComponent getHeader()
  {
    return getFacet(HEADER_FACET);
  }

  /**
   * the component used to render the table header.
   */
  @SuppressWarnings("unchecked")
  final public void setHeader(UIComponent headerFacet)
  {
    getFacets().put(HEADER_FACET, headerFacet);
  }

  /**
   * content to be rendered inline with the navigation bar.
   */
  final public UIComponent getActions()
  {
    return getFacet(ACTIONS_FACET);
  }

  /**
   * content to be rendered inline with the navigation bar.
   */
  @SuppressWarnings("unchecked")
  final public void setActions(UIComponent actionsFacet)
  {
    getFacets().put(ACTIONS_FACET, actionsFacet);
  }

  /**
   * the component used to stamp each step of the focus path of this
   *                   treeTable.
   */
  final public UIComponent getPathStamp()
  {
    return getFacet(PATH_STAMP_FACET);
  }

  /**
   * the component used to stamp each step of the focus path of this
   *                   treeTable.
   */
  @SuppressWarnings("unchecked")
  final public void setPathStamp(UIComponent pathStampFacet)
  {
    getFacets().put(PATH_STAMP_FACET, pathStampFacet);
  }

  /**
   * Gets if the horizontal grid lines will be drawn.
   *
   * @return  the new horizontalGridVisible value
   */
  final public boolean isHorizontalGridVisible()
  {
    return ComponentUtils.resolveBoolean(getProperty(HORIZONTAL_GRID_VISIBLE_KEY), true);
  }

  /**
   * Sets if the horizontal grid lines will be drawn.
   * 
   * @param horizontalGridVisible  the new horizontalGridVisible value
   */
  final public void setHorizontalGridVisible(boolean horizontalGridVisible)
  {
    setProperty(HORIZONTAL_GRID_VISIBLE_KEY, horizontalGridVisible ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets if the vertical grid lines will be drawn.
   *
   * @return  the new verticalGridVisible value
   */
  final public boolean isVerticalGridVisible()
  {
    return ComponentUtils.resolveBoolean(getProperty(VERTICAL_GRID_VISIBLE_KEY), true);
  }

  /**
   * Sets if the vertical grid lines will be drawn.
   * 
   * @param verticalGridVisible  the new verticalGridVisible value
   */
  final public void setVerticalGridVisible(boolean verticalGridVisible)
  {
    setProperty(VERTICAL_GRID_VISIBLE_KEY, verticalGridVisible ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets text displayed when a table is empty.
   *
   * @return  the new emptyText value
   */
  final public String getEmptyText()
  {
    return ComponentUtils.resolveString(getProperty(EMPTY_TEXT_KEY));
  }

  /**
   * Sets text displayed when a table is empty.
   * 
   * @param emptyText  the new emptyText value
   */
  final public void setEmptyText(String emptyText)
  {
    setProperty(EMPTY_TEXT_KEY, (emptyText));
  }

  /**
   * Gets the interval between which the column banding alternates.  For example, a columnBandingInterval of 1 would display alternately banded columns.
   *
   * @return  the new columnBandingInterval value
   */
  final public int getColumnBandingInterval()
  {
    return ComponentUtils.resolveInteger(getProperty(COLUMN_BANDING_INTERVAL_KEY), 0);
  }

  /**
   * Sets the interval between which the column banding alternates.  For example, a columnBandingInterval of 1 would display alternately banded columns.
   * 
   * @param columnBandingInterval  the new columnBandingInterval value
   */
  final public void setColumnBandingInterval(int columnBandingInterval)
  {
    setProperty(COLUMN_BANDING_INTERVAL_KEY, Integer.valueOf(columnBandingInterval));
  }

  /**
   * Gets the interval between which the row banding alternates.  For example, rowBandingInterval=1 would displayalternately banded rows in the Grid.
   *
   * @return  the new rowBandingInterval value
   */
  final public int getRowBandingInterval()
  {
    return ComponentUtils.resolveInteger(getProperty(ROW_BANDING_INTERVAL_KEY), 0);
  }

  /**
   * Sets the interval between which the row banding alternates.  For example, rowBandingInterval=1 would displayalternately banded rows in the Grid.
   * 
   * @param rowBandingInterval  the new rowBandingInterval value
   */
  final public void setRowBandingInterval(int rowBandingInterval)
  {
    setProperty(ROW_BANDING_INTERVAL_KEY, Integer.valueOf(rowBandingInterval));
  }

  /**
   * Gets whether rows in this table selectable. Valid values are "none", "single", "multiple"
   *
   * @return  the new rowSelection value
   */
  final public String getRowSelection()
  {
    return ComponentUtils.resolveString(getProperty(ROW_SELECTION_KEY), "none");
  }

  /**
   * Sets whether rows in this table selectable. Valid values are "none", "single", "multiple"
   * 
   * @param rowSelection  the new rowSelection value
   */
  final public void setRowSelection(String rowSelection)
  {
    setProperty(ROW_SELECTION_KEY, (rowSelection));
  }

  /**
   * Gets If set to TRUE on a form element, the component will automatically submit
   *      the enclosing form when an appropriate action takes place (a click, text
   *      change, etc.).  This only takes effect if rowSelection attribute enabled.
   *
   * @return  the new autoSubmit value
   */
  final public boolean isAutoSubmit()
  {
    return ComponentUtils.resolveBoolean(getProperty(AUTO_SUBMIT_KEY), false);
  }

  /**
   * Sets If set to TRUE on a form element, the component will automatically submit
   *      the enclosing form when an appropriate action takes place (a click, text
   *      change, etc.).  This only takes effect if rowSelection attribute enabled.
   * 
   * @param autoSubmit  the new autoSubmit value
   */
  final public void setAutoSubmit(boolean autoSubmit)
  {
    setProperty(AUTO_SUBMIT_KEY, autoSubmit ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets the width of the table.  The value must either be a number of pixels or a percentage - it is not a CSS width.
   *
   * @return  the new width value
   */
  final public String getWidth()
  {
    return ComponentUtils.resolveString(getProperty(WIDTH_KEY));
  }

  /**
   * Sets the width of the table.  The value must either be a number of pixels or a percentage - it is not a CSS width.
   * 
   * @param width  the new width value
   */
  final public void setWidth(String width)
  {
    setProperty(WIDTH_KEY, (width));
  }

  /**
   * Gets the summary of this table's purpose and structure
   *          for user agents rendering to non-visual media.
   *
   * @return  the new summary value
   */
  final public String getSummary()
  {
    return ComponentUtils.resolveString(getProperty(SUMMARY_KEY));
  }

  /**
   * Sets the summary of this table's purpose and structure
   *          for user agents rendering to non-visual media.
   * 
   * @param summary  the new summary value
   */
  final public void setSummary(String summary)
  {
    setProperty(SUMMARY_KEY, (summary));
  }

  /**
   * Gets the CSS styles to use for this component.
   *
   * @return  the new inlineStyle value
   */
  final public String getInlineStyle()
  {
    return ComponentUtils.resolveString(getProperty(INLINE_STYLE_KEY));
  }

  /**
   * Sets the CSS styles to use for this component.
   * 
   * @param inlineStyle  the new inlineStyle value
   */
  final public void setInlineStyle(String inlineStyle)
  {
    setProperty(INLINE_STYLE_KEY, (inlineStyle));
  }

  /**
   * Gets a CSS style class to use for this component.
   *
   * @return  the new styleClass value
   */
  final public String getStyleClass()
  {
    return ComponentUtils.resolveString(getProperty(STYLE_CLASS_KEY));
  }

  /**
   * Sets a CSS style class to use for this component.
   * 
   * @param styleClass  the new styleClass value
   */
  final public void setStyleClass(String styleClass)
  {
    setProperty(STYLE_CLASS_KEY, (styleClass));
  }

  /**
   * Gets The short description of the component. This text is commonly used by user agents to display tooltip help text.
   *
   * @return  the new shortDesc value
   */
  final public String getShortDesc()
  {
    return ComponentUtils.resolveString(getProperty(SHORT_DESC_KEY));
  }

  /**
   * Sets The short description of the component. This text is commonly used by user agents to display tooltip help text.
   * 
   * @param shortDesc  the new shortDesc value
   */
  final public void setShortDesc(String shortDesc)
  {
    setProperty(SHORT_DESC_KEY, (shortDesc));
  }

  /**
   * Gets the IDs of the components that should trigger a partial update.
   *         <p>
   *         This component will listen on the trigger components. If one of the
   *         trigger components receives an event that will cause it to update
   *         in some way, this component will request to be updated too.</p>
   *         <p>
   *         Separate multiple triggers with a space. e.g., partialTriggers="cmp1 cmp2"
   *         </p>
   *         <p>
   *         Identifiers must account for NamingContainers.  You can use a single colon to start the search from the root,
   *         or use multiple colons to move up through the NamingContainer. For example,
   *         "::" will pop out of this component's naming container (it pops out of itself if it is a naming container), 
   *         ":::" will pop out of two naming containers, etc. The search for
   *         the partialTrigger begins from there. e.g., partialTriggers=":::commandButton1" the search begins for the 
   *         component with id = commandButton1 after popping out of two naming containers relative to this component.
   *         To go into naming containers, you separate the naming containers with ':', e.g.,partialTriggers= "nc1:nc2:nc3:componentId".</p>
   *
   * @return  the new partialTriggers value
   */
  final public String[] getPartialTriggers()
  {
    return (String[])getProperty(PARTIAL_TRIGGERS_KEY);
  }

  /**
   * Sets the IDs of the components that should trigger a partial update.
   *         <p>
   *         This component will listen on the trigger components. If one of the
   *         trigger components receives an event that will cause it to update
   *         in some way, this component will request to be updated too.</p>
   *         <p>
   *         Separate multiple triggers with a space. e.g., partialTriggers="cmp1 cmp2"
   *         </p>
   *         <p>
   *         Identifiers must account for NamingContainers.  You can use a single colon to start the search from the root,
   *         or use multiple colons to move up through the NamingContainer. For example,
   *         "::" will pop out of this component's naming container (it pops out of itself if it is a naming container), 
   *         ":::" will pop out of two naming containers, etc. The search for
   *         the partialTrigger begins from there. e.g., partialTriggers=":::commandButton1" the search begins for the 
   *         component with id = commandButton1 after popping out of two naming containers relative to this component.
   *         To go into naming containers, you separate the naming containers with ':', e.g.,partialTriggers= "nc1:nc2:nc3:componentId".</p>
   * 
   * @param partialTriggers  the new partialTriggers value
   */
  final public void setPartialTriggers(String[] partialTriggers)
  {
    setProperty(PARTIAL_TRIGGERS_KEY, (partialTriggers));
  }

  /**
   * Gets an onclick Javascript handler.
   *
   * @return  the new onclick value
   */
  final public String getOnclick()
  {
    return ComponentUtils.resolveString(getProperty(ONCLICK_KEY));
  }

  /**
   * Sets an onclick Javascript handler.
   * 
   * @param onclick  the new onclick value
   */
  final public void setOnclick(String onclick)
  {
    setProperty(ONCLICK_KEY, (onclick));
  }

  /**
   * Gets an ondblclick Javascript handler.
   *
   * @return  the new ondblclick value
   */
  final public String getOndblclick()
  {
    return ComponentUtils.resolveString(getProperty(ONDBLCLICK_KEY));
  }

  /**
   * Sets an ondblclick Javascript handler.
   * 
   * @param ondblclick  the new ondblclick value
   */
  final public void setOndblclick(String ondblclick)
  {
    setProperty(ONDBLCLICK_KEY, (ondblclick));
  }

  /**
   * Gets an onmousedown Javascript handler.
   *
   * @return  the new onmousedown value
   */
  final public String getOnmousedown()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEDOWN_KEY));
  }

  /**
   * Sets an onmousedown Javascript handler.
   * 
   * @param onmousedown  the new onmousedown value
   */
  final public void setOnmousedown(String onmousedown)
  {
    setProperty(ONMOUSEDOWN_KEY, (onmousedown));
  }

  /**
   * Gets an onmouseup Javascript handler.
   *
   * @return  the new onmouseup value
   */
  final public String getOnmouseup()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEUP_KEY));
  }

  /**
   * Sets an onmouseup Javascript handler.
   * 
   * @param onmouseup  the new onmouseup value
   */
  final public void setOnmouseup(String onmouseup)
  {
    setProperty(ONMOUSEUP_KEY, (onmouseup));
  }

  /**
   * Gets an onmouseover Javascript handler.
   *
   * @return  the new onmouseover value
   */
  final public String getOnmouseover()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEOVER_KEY));
  }

  /**
   * Sets an onmouseover Javascript handler.
   * 
   * @param onmouseover  the new onmouseover value
   */
  final public void setOnmouseover(String onmouseover)
  {
    setProperty(ONMOUSEOVER_KEY, (onmouseover));
  }

  /**
   * Gets an onmousemove Javascript handler.
   *
   * @return  the new onmousemove value
   */
  final public String getOnmousemove()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEMOVE_KEY));
  }

  /**
   * Sets an onmousemove Javascript handler.
   * 
   * @param onmousemove  the new onmousemove value
   */
  final public void setOnmousemove(String onmousemove)
  {
    setProperty(ONMOUSEMOVE_KEY, (onmousemove));
  }

  /**
   * Gets an onmouseout Javascript handler.
   *
   * @return  the new onmouseout value
   */
  final public String getOnmouseout()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEOUT_KEY));
  }

  /**
   * Sets an onmouseout Javascript handler.
   * 
   * @param onmouseout  the new onmouseout value
   */
  final public void setOnmouseout(String onmouseout)
  {
    setProperty(ONMOUSEOUT_KEY, (onmouseout));
  }

  /**
   * Gets an onkeypress Javascript handler.
   *
   * @return  the new onkeypress value
   */
  final public String getOnkeypress()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYPRESS_KEY));
  }

  /**
   * Sets an onkeypress Javascript handler.
   * 
   * @param onkeypress  the new onkeypress value
   */
  final public void setOnkeypress(String onkeypress)
  {
    setProperty(ONKEYPRESS_KEY, (onkeypress));
  }

  /**
   * Gets an onkeydown Javascript handler.
   *
   * @return  the new onkeydown value
   */
  final public String getOnkeydown()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYDOWN_KEY));
  }

  /**
   * Sets an onkeydown Javascript handler.
   * 
   * @param onkeydown  the new onkeydown value
   */
  final public void setOnkeydown(String onkeydown)
  {
    setProperty(ONKEYDOWN_KEY, (onkeydown));
  }

  /**
   * Gets an onkeyup Javascript handler.
   *
   * @return  the new onkeyup value
   */
  final public String getOnkeyup()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYUP_KEY));
  }

  /**
   * Sets an onkeyup Javascript handler.
   * 
   * @param onkeyup  the new onkeyup value
   */
  final public void setOnkeyup(String onkeyup)
  {
    setProperty(ONKEYUP_KEY, (onkeyup));
  }

  /**
   * Gets Whether the Expand All, Collapse All links should be rendered.
   *
   * @return  the new expandAllEnabled value
   */
  final public boolean isExpandAllEnabled()
  {
    return ComponentUtils.resolveBoolean(getProperty(EXPAND_ALL_ENABLED_KEY), true);
  }

  /**
   * Sets Whether the Expand All, Collapse All links should be rendered.
   * 
   * @param expandAllEnabled  the new expandAllEnabled value
   */
  final public void setExpandAllEnabled(boolean expandAllEnabled)
  {
    setProperty(EXPAND_ALL_ENABLED_KEY, expandAllEnabled ? Boolean.TRUE : Boolean.FALSE);
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
   * Construct an instance of the CoreTreeTable.
   */
  protected CoreTreeTable(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.TreeTable","org.apache.myfaces.trinidad.TreeTable");
  }
}
