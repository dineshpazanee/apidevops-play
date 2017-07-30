
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""()
<!DOCTYPE html>
<html lang="en" data-textdirection="ltr" class="loading">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta name="author" content="dinesh pazani">
    <title>Apidevops Cloud platform tool</title>
    <link rel="apple-touch-icon" sizes="60x60" href='"""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("/app-assets/images/ico/apple-icon-60.png")),format.raw/*10.122*/("""'>
    <link rel="apple-touch-icon" sizes="76x76" href='"""),_display_(/*11.55*/routes/*11.61*/.Assets.versioned("/app-assets/images/ico/apple-icon-76.png")),format.raw/*11.122*/("""'>
    <link rel="apple-touch-icon" sizes="120x120" href='"""),_display_(/*12.57*/routes/*12.63*/.Assets.versioned("/app-assets/images/ico/apple-icon-120.png")),format.raw/*12.125*/("""'>
    <link rel="apple-touch-icon" sizes="152x152" href='"""),_display_(/*13.57*/routes/*13.63*/.Assets.versioned("/app-assets/images/ico/apple-icon-152.png")),format.raw/*13.125*/("""'>
    <link rel="shortcut icon" type="image/x-icon" href='"""),_display_(/*14.58*/routes/*14.64*/.Assets.versioned("/app-assets/images/ico/favicon.ico")),format.raw/*14.119*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*15.55*/routes/*15.61*/.Assets.versioned("/app-assets/images/ico/favicon-32.png")),format.raw/*15.119*/("""'>
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-touch-fullscreen" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="default">
    <!-- BEGIN VENDOR CSS-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*20.51*/routes/*20.57*/.Assets.versioned("/app-assets/css/bootstrap.css")),format.raw/*20.107*/("""'>
    <!-- font icons-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*22.51*/routes/*22.57*/.Assets.versioned("/app-assets/fonts/icomoon.css")),format.raw/*22.107*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*23.51*/routes/*23.57*/.Assets.versioned("/app-assets/fonts/flag-icon-css/css/flag-icon.min.css")),format.raw/*23.131*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*24.51*/routes/*24.57*/.Assets.versioned("/app-assets/vendors/css/extensions/pace.css")),format.raw/*24.121*/("""'>
    <!-- END VENDOR CSS-->
    <!-- BEGIN ROBUST CSS-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*27.51*/routes/*27.57*/.Assets.versioned("/app-assets/css/bootstrap-extended.css")),format.raw/*27.116*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*28.51*/routes/*28.57*/.Assets.versioned("/app-assets/css/app.css")),format.raw/*28.101*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*29.51*/routes/*29.57*/.Assets.versioned("/app-assets/css/colors.css")),format.raw/*29.104*/("""'>
    <!-- END ROBUST CSS-->
    <!-- BEGIN Page Level CSS-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*32.51*/routes/*32.57*/.Assets.versioned("/app-assets/css/core/menu/menu-types/vertical-menu.css")),format.raw/*32.132*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*33.51*/routes/*33.57*/.Assets.versioned("/app-assets/css/core/menu/menu-types/vertical-overlay-menu.css")),format.raw/*33.140*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*34.51*/routes/*34.57*/.Assets.versioned("/app-assets/css/core/colors/palette-gradient.css")),format.raw/*34.126*/("""'>
    <!-- END Page Level CSS-->
    <!-- BEGIN Custom CSS-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*37.51*/routes/*37.57*/.Assets.versioned("/assets/css/style.css")),format.raw/*37.99*/("""'>
    <!-- END Custom CSS-->
  </head>
  <body data-open="click" data-menu="vertical-menu" data-col="2-columns" class="vertical-layout vertical-menu 2-columns  fixed-navbar">

    <!-- navbar-fixed-top-->
    <nav class="header-navbar navbar navbar-with-menu navbar-fixed-top navbar-semi-dark navbar-shadow">
      <div class="navbar-wrapper">
        <div class="navbar-header">
          <ul class="nav navbar-nav">
            <li class="nav-item mobile-menu hidden-md-up float-xs-left"><a class="nav-link nav-menu-main menu-toggle hidden-xs"><i class="icon-menu5 font-large-1"></i></a></li>
            <li class="nav-item"><a href="#" class="navbar-brand nav-link"><img alt="branding logo" src='"""),_display_(/*48.107*/routes/*48.113*/.Assets.versioned("/app-assets/images/apidevops-log1.png")),format.raw/*48.171*/("""' data-expand='"""),_display_(/*48.187*/routes/*48.193*/.Assets.versioned("/app-assets/images/apidevops-log1.png")),format.raw/*48.251*/("""' style="width:150px;height:60px;" data-collapse='"""),_display_(/*48.302*/routes/*48.308*/.Assets.versioned("/app-assets/images/apidevops-avathor.png")),format.raw/*48.369*/("""' style="width:150px;height:60px;" class="brand-logo")'></a></li>
            <li class="nav-item hidden-md-up float-xs-right"><a data-toggle="collapse" data-target="#navbar-mobile" class="nav-link open-navbar-container"><i class="icon-ellipsis pe-2x icon-icon-rotate-right-right"></i></a></li>
          </ul>
        </div>
        <div class="navbar-container content container-fluid">
          <div id="navbar-mobile" class="collapse navbar-toggleable-sm">
            <ul class="nav navbar-nav">
              <li class="nav-item hidden-sm-down"><a class="nav-link nav-menu-main menu-toggle hidden-xs"><i class="icon-menu5">         </i></a></li>
              <li class="nav-item hidden-sm-down"><a href="#" class="nav-link nav-link-expand"><i class="ficon icon-expand2"></i></a></li>
              <li class="nav-item hidden-sm-down"><a href="http://www.apidevops.com" target="_blank" class="btn btn-success upgrade-to-pro">Apidevops</a></li>
            </ul>
            <ul class="nav navbar-nav float-xs-right">
              <li class="dropdown dropdown-language nav-item"><a id="dropdown-flag" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="dropdown-toggle nav-link"><i class="flag-icon flag-icon-gb"></i><span class="selected-language">English</span></a>
                <div aria-labelledby="dropdown-flag" class="dropdown-menu"><a href="#" class="dropdown-item"><i class="flag-icon flag-icon-gb"></i> English</a><a href="#" class="dropdown-item"><i class="flag-icon flag-icon-fr"></i> French</a><a href="#" class="dropdown-item"><i class="flag-icon flag-icon-cn"></i> Chinese</a><a href="#" class="dropdown-item"><i class="flag-icon flag-icon-de"></i> German</a></div>
              </li>
              <li class="dropdown dropdown-notification nav-item"><a href="#" data-toggle="dropdown" class="nav-link nav-link-label"><i class="ficon icon-bell4"></i><span class="tag tag-pill tag-default tag-danger tag-default tag-up">5</span></a>
                <ul class="dropdown-menu dropdown-menu-media dropdown-menu-right">
                  <li class="dropdown-menu-header">
                    <h6 class="dropdown-header m-0"><span class="grey darken-2">Notifications</span><span class="notification-tag tag tag-default tag-danger float-xs-right m-0">5 New</span></h6>
                  </li>
                  <li class="list-group scrollable-container"><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left valign-middle"><i class="icon-cart3 icon-bg-circle bg-cyan"></i></div>
                        <div class="media-body">
                          <h6 class="media-heading">You have new order!</h6>
                          <p class="notification-text font-small-3 text-muted">Lorem ipsum dolor sit amet, consectetuer elit.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">30 minutes ago</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left valign-middle"><i class="icon-monitor3 icon-bg-circle bg-red bg-darken-1"></i></div>
                        <div class="media-body">
                          <h6 class="media-heading red darken-1">99% Server load</h6>
                          <p class="notification-text font-small-3 text-muted">Aliquam tincidunt mauris eu risus.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Five hour ago</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left valign-middle"><i class="icon-server2 icon-bg-circle bg-yellow bg-darken-3"></i></div>
                        <div class="media-body">
                          <h6 class="media-heading yellow darken-3">Warning notifixation</h6>
                          <p class="notification-text font-small-3 text-muted">Vestibulum auctor dapibus neque.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Today</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left valign-middle"><i class="icon-check2 icon-bg-circle bg-green bg-accent-3"></i></div>
                        <div class="media-body">
                          <h6 class="media-heading">Complete the task</h6><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Last week</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left valign-middle"><i class="icon-bar-graph-2 icon-bg-circle bg-teal"></i></div>
                        <div class="media-body">
                          <h6 class="media-heading">Generate monthly report</h6><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Last month</time></small>
                        </div>
                      </div></a></li>
                  <li class="dropdown-menu-footer"><a href="javascript:void(0)" class="dropdown-item text-muted text-xs-center">Read all notifications</a></li>
                </ul>
              </li>
              <li class="dropdown dropdown-notification nav-item"><a href="#" data-toggle="dropdown" class="nav-link nav-link-label"><i class="ficon icon-mail6"></i><span class="tag tag-pill tag-default tag-info tag-default tag-up">8</span></a>
                <ul class="dropdown-menu dropdown-menu-media dropdown-menu-right">
                  <li class="dropdown-menu-header">
                    <h6 class="dropdown-header m-0"><span class="grey darken-2">Messages</span><span class="notification-tag tag tag-default tag-info float-xs-right m-0">4 New</span></h6>
                  </li>
                  <li class="list-group scrollable-container"><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-online rounded-circle"><img src='"""),_display_(/*117.120*/routes/*117.126*/.Assets.versioned("/app-assets/images/portrait/small/avatar-s-1.png")),format.raw/*117.195*/("""' alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Margaret Govan</h6>
                          <p class="notification-text font-small-3 text-muted">I like your portfolio, let's start the project.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Today</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-busy rounded-circle"><img src='"""),_display_(/*125.118*/routes/*125.124*/.Assets.versioned("/app-assets/images/portrait/small/avatar-s-2.png")),format.raw/*125.193*/("""' alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Bret Lezama</h6>
                          <p class="notification-text font-small-3 text-muted">I have seen your work, there is</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Tuesday</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-online rounded-circle"><img src='"""),_display_(/*133.120*/routes/*133.126*/.Assets.versioned("/app-assets/images/portrait/small/avatar-s-3.png")),format.raw/*133.195*/("""' alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Carie Berra</h6>
                          <p class="notification-text font-small-3 text-muted">Can we have call in this week ?</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Friday</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-away rounded-circle"><img src='"""),_display_(/*141.118*/routes/*141.124*/.Assets.versioned("/app-assets/images/portrait/small/avatar-s-6.png")),format.raw/*141.193*/("""' alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Eric Alsobrook</h6>
                          <p class="notification-text font-small-3 text-muted">We have project party this saturday night.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">last month</time></small>
                        </div>
                      </div></a></li>
                  <li class="dropdown-menu-footer"><a href="javascript:void(0)" class="dropdown-item text-muted text-xs-center">Read all messages</a></li>
                </ul>
              </li>
              <li class="dropdown dropdown-user nav-item"><a href="#" data-toggle="dropdown" class="dropdown-toggle nav-link dropdown-user-link"><span class="avatar avatar-online"><img src='"""),_display_(/*151.192*/routes/*151.198*/.Assets.versioned("/app-assets/images/portrait/small/avatar-s-1.png")),format.raw/*151.267*/("""' alt="avatar"><i></i></span><span class="user-name">John Doe</span></a>
                <div class="dropdown-menu dropdown-menu-right"><a href="#" class="dropdown-item"><i class="icon-head"></i> Edit Profile</a><a href="#" class="dropdown-item"><i class="icon-mail6"></i> My Inbox</a><a href="#" class="dropdown-item"><i class="icon-clipboard2"></i> Task</a><a href="#" class="dropdown-item"><i class="icon-calendar5"></i> Calender</a>
                  <div class="dropdown-divider"></div><a href="#" class="dropdown-item"><i class="icon-power3"></i> Logout</a>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </nav>

    <!-- ////////////////////////////////////////////////////////////////////////////-->


    <!-- main menu-->
    <div data-scroll-to-active="true" class="main-menu menu-fixed menu-dark menu-accordion menu-shadow">
      <!-- main menu header-->
      <div class="main-menu-header">
        <input type="text" placeholder="Search" class="menu-search form-control round"/>
      </div>
      <!-- / main menu header-->
      <!-- main menu content-->
      <div class="main-menu-content">
        <ul id="main-menu-navigation" data-menu="menu-navigation" class="navigation navigation-main">
          <li class=" nav-item"><a href="index.html"><i class="icon-home3"></i><span data-i18n="nav.dash.main" class="menu-title">Dashboard</span><span class="tag tag tag-primary tag-pill float-xs-right mr-2">2</span></a>
            <ul class="menu-content">
              <li class="active"><a href="index.html" data-i18n="nav.dash.main" class="menu-item">Dashboard</a>
              </li>
              <li><a href="dashboard-2.html" data-i18n="nav.dash.main" class="menu-item">Dashboard 2</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-stack-2"></i><span data-i18n="nav.page_layouts.main" class="menu-title">Page layouts</span></a>
            <ul class="menu-content">
              <li><a href="layout-1-column.html" data-i18n="nav.page_layouts.1_column" class="menu-item">1 column</a>
              </li>
              <li><a href="layout-2-columns.html" data-i18n="nav.page_layouts.2_columns" class="menu-item">2 columns</a>
              </li>
              <li><a href="layout-boxed.html" data-i18n="nav.page_layouts.boxed_layout" class="menu-item">Boxed layout</a>
              </li>
              <li><a href="layout-static.html" data-i18n="nav.page_layouts.static_layout" class="menu-item">Static layout</a>
              </li>
              <li class="navigation-divider"></li>
              <li><a href="layout-light.html" data-i18n="nav.page_layouts.light_layout" class="menu-item">Light layout</a>
              </li>
              <li><a href="layout-dark.html" data-i18n="nav.page_layouts.dark_layout" class="menu-item">Dark layout</a>
              </li>
              <li><a href="layout-semi-dark.html" data-i18n="nav.page_layouts.semi_dark_layout" class="menu-item">Semi dark layout</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-briefcase4"></i><span data-i18n="nav.project.main" class="menu-title">Pages</span></a>
            <ul class="menu-content">
              <li><a href="invoice-template.html" data-i18n="nav.invoice.invoice_template" class="menu-item">Invoice Template</a>
              </li>
              <li><a href="gallery-grid.html" data-i18n="nav.gallery_pages.gallery_grid" class="menu-item">Gallery Grid</a>
              </li>
              <li><a href="search-page.html" data-i18n="nav.search_pages.search_page" class="menu-item">Search Page</a>
              </li>
              <li><a href="search-website.html" data-i18n="nav.search_pages.search_website" class="menu-item">Search Website</a>
              </li>
              <li><a href="login-simple.html" data-i18n="nav.login_register_pages.login_simple" class="menu-item">Login Simple</a>
              </li>
              <li><a href="register-simple.html" data-i18n="nav.login_register_pages.register_simple" class="menu-item">Register Simple</a>
              </li>
              <li><a href="unlock-user.html" data-i18n="nav.login_register_pages.unlock_user" class="menu-item">Unlock User</a>
              </li>
              <li><a href="recover-password.html" data-i18n="nav.login_register_pages.recover_password" class="menu-item">Recover Password</a>
              </li>
              <li><a href="#" data-i18n="nav.error_pages.main" class="menu-item">Error</a>
                <ul class="menu-content">
                  <li><a href="error-400.html" data-i18n="nav.error_pages.error_400" class="menu-item">Error 400</a>
                  </li>
                  <li><a href="error-401.html" data-i18n="nav.error_pages.error_401" class="menu-item">Error 401</a>
                  </li>
                  <li><a href="error-403.html" data-i18n="nav.error_pages.error_403" class="menu-item">Error 403</a>
                  </li>
                  <li><a href="error-404.html" data-i18n="nav.error_pages.error_404" class="menu-item">Error 404</a>
                  </li>
                  <li><a href="error-500.html" data-i18n="nav.error_pages.error_500" class="menu-item">Error 500</a>
                  </li>
                </ul>
              </li>
              <li><a href="coming-soon-flat.html" data-i18n="nav.other_pages.coming_soon.coming_soon_flat" class="menu-item">Coming Soon</a>
              </li>
              <li><a href="under-maintenance.html" data-i18n="nav.other_pages.under_maintenance" class="menu-item">Maintenance</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-ios-albums-outline"></i><span data-i18n="nav.cards.main" class="menu-title">Cards</span></a>
            <ul class="menu-content">
              <li><a href="card-bootstrap.html" data-i18n="nav.cards.card_bootstrap" class="menu-item">Bootstrap Cards</a>
              </li>
              <li><a href="card-actions.html" data-i18n="nav.cards.card_actions" class="menu-item">Card Action</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-whatshot"></i><span data-i18n="nav.advance_cards.main" class="menu-title">Advance Cards</span></a>
            <ul class="menu-content">
              <li><a href="card-statistics.html" data-i18n="nav.cards.card_statistics" class="menu-item">Statistics</a>
              </li>
              <li><a href="card-charts.html" data-i18n="nav.cards.card_charts" class="menu-item">Charts</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-compass3"></i><span data-i18n="nav.content.main" class="menu-title">Content</span></a>
            <ul class="menu-content">
              <li><a href="content-grid.html" data-i18n="nav.content.content_grid" class="menu-item">Grid</a>
              </li>
              <li><a href="content-typography.html" data-i18n="nav.content.content_typography" class="menu-item">Typography</a>
              </li>
              <li><a href="content-text-utilities.html" data-i18n="nav.content.content_text_utilities" class="menu-item">Text utilities</a>
              </li>
              <li><a href="content-helper-classes.html" data-i18n="nav.content.content_helper_classes" class="menu-item">Helper classes</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-grid2"></i><span data-i18n="nav.components.main" class="menu-title">Components</span></a>
            <ul class="menu-content">
              <li><a href="component-alerts.html" data-i18n="nav.components.component_alerts" class="menu-item">Alerts</a>
              </li>
              <li><a href="component-buttons-basic.html" data-i18n="nav.components.components_buttons.component_buttons_basic" class="menu-item">Basic Buttons</a>
              </li>
              <li><a href="component-carousel.html" data-i18n="nav.components.component_carousel" class="menu-item">Carousel</a>
              </li>
              <li><a href="component-collapse.html" data-i18n="nav.components.component_collapse" class="menu-item">Collapse</a>
              </li>
              <li><a href="component-dropdowns.html" data-i18n="nav.components.component_dropdowns" class="menu-item">Dropdowns</a>
              </li>
              <li><a href="component-list-group.html" data-i18n="nav.components.component_list_group" class="menu-item">List Group</a>
              </li>
              <li><a href="component-modals.html" data-i18n="nav.components.component_modals" class="menu-item">Modals</a>
              </li>
              <li><a href="component-pagination.html" data-i18n="nav.components.component_pagination" class="menu-item">Pagination</a>
              </li>
              <li><a href="component-navs-component.html" data-i18n="nav.components.component_navs_component" class="menu-item">Navs Component</a>
              </li>
              <li><a href="component-tabs-component.html" data-i18n="nav.components.component_tabs_component" class="menu-item">Tabs Component</a>
              </li>
              <li><a href="component-pills-component.html" data-i18n="nav.components.component_pills_component" class="menu-item">Pills Component</a>
              </li>
              <li><a href="component-tooltips.html" data-i18n="nav.components.component_tooltips" class="menu-item">Tooltips</a>
              </li>
              <li><a href="component-popovers.html" data-i18n="nav.components.component_popovers" class="menu-item">Popovers</a>
              </li>
              <li><a href="component-tags.html" data-i18n="nav.components.component_tags" class="menu-item">Tags</a>
              </li>
              <li><a href="component-pill-tags.html" class="menu-item">Pill Tags</a>
              </li>
              <li><a href="component-progress.html" data-i18n="nav.components.component_progress" class="menu-item">Progress</a>
              </li>
              <li><a href="component-media-objects.html" data-i18n="nav.components.component_media_objects" class="menu-item">Media Objects</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-eye6"></i><span data-i18n="nav.icons.main" class="menu-title">Icons</span></a>
            <ul class="menu-content">
              <li><a href="icons-feather.html" data-i18n="nav.icons.icons_feather" class="menu-item">Feather</a>
              </li>
              <li><a href="icons-ionicons.html" data-i18n="nav.icons.icons_ionicons" class="menu-item">Ionicons</a>
              </li>
              <li><a href="icons-fps-line.html" data-i18n="nav.icons.icons_fps_line" class="menu-item">FPS Line Icons</a>
              </li>
              <li><a href="icons-ico-moon.html" data-i18n="nav.icons.icons_ico_moon" class="menu-item">Ico Moon</a>
              </li>
              <li><a href="icons-font-awesome.html" data-i18n="nav.icons.icons_font_awesome" class="menu-item">Font Awesome</a>
              </li>
              <li><a href="icons-meteocons.html" data-i18n="nav.icons.icons_meteocons" class="menu-item">Meteocons</a>
              </li>
              <li><a href="icons-evil.html" data-i18n="nav.icons.icons_evil" class="menu-item">Evil Icons</a>
              </li>
              <li><a href="icons-linecons.html" data-i18n="nav.icons.icons_linecons" class="menu-item">Linecons</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="form-layout-basic.html"><i class="icon-paper"></i><span data-i18n="nav.form_layouts.form_layout_basic" class="menu-title">Basic Forms</span></a>
          </li>
          <li class=" nav-item"><a href="table-basic.html"><i class="icon-table2"></i><span data-i18n="nav.bootstrap_tables.table_basic" class="menu-title">Basic Tables</span></a>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-bar-graph-2"></i><span data-i18n="nav.google_charts.main" class="menu-title">google Charts</span></a>
            <ul class="menu-content">
              <li><a href="google-bar-charts.html" data-i18n="nav.google_charts.google_bar_charts" class="menu-item">Bar charts</a>
              </li>
              <li><a href="google-line-charts.html" data-i18n="nav.google_charts.google_line_charts" class="menu-item">Line charts</a>
              </li>
              <li><a href="google-pie-charts.html" data-i18n="nav.google_charts.google_pie_charts" class="menu-item">Pie charts</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-stats-dots"></i><span data-i18n="nav.chartjs.main" class="menu-title">Chartjs</span></a>
            <ul class="menu-content">
              <li><a href="chartjs-line-charts.html" data-i18n="nav.chartjs.chartjs_line_charts" class="menu-item">Line charts</a>
              </li>
              <li><a href="chartjs-bar-charts.html" data-i18n="nav.chartjs.chartjs_bar_charts" class="menu-item">Bar charts</a>
              </li>
              <li><a href="chartjs-pie-doughnut-charts.html" data-i18n="nav.chartjs.chartjs_pie_doughnut_charts" class="menu-item">Pie &amp; Doughnut charts</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-pie-graph2"></i><span data-i18n="nav.flot_charts.main" class="menu-title">Flot Charts</span></a>
            <ul class="menu-content">
              <li><a href="flot-line-charts.html" data-i18n="nav.flot_charts.flot_line_charts" class="menu-item">Line charts</a>
              </li>
              <li><a href="flot-bar-charts.html" data-i18n="nav.flot_charts.flot_bar_charts" class="menu-item">Bar charts</a>
              </li>
              <li><a href="flot-pie-charts.html" data-i18n="nav.flot_charts.flot_pie_charts" class="menu-item">Pie charts</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-map22"></i><span data-i18n="nav.maps.main" class="menu-title">Maps</span></a>
            <ul class="menu-content">
              <li><a href="gmaps-basic-maps.html" data-i18n="nav.maps.google_maps.gmaps_basic_maps" class="menu-item">Maps</a>
              </li>
              <li><a href="vector-maps-jvq.html" data-i18n="nav.maps.vector_maps.vector_maps_jvq" class="menu-item">Vector Maps</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-paint-format"></i><span data-i18n="nav.color_palette.main" class="menu-title">Color Palette</span></a>
            <ul class="menu-content">
              <li><a href="color-palette-primary.html" data-i18n="nav.color_palette.color_palette_primary" class="menu-item">Primary palette</a>
              </li>
              <li><a href="color-palette-danger.html" data-i18n="nav.color_palette.color_palette_danger" class="menu-item">Danger palette</a>
              </li>
              <li><a href="color-palette-success.html" data-i18n="nav.color_palette.color_palette_success" class="menu-item">Success palette</a>
              </li>
              <li><a href="color-palette-warning.html" data-i18n="nav.color_palette.color_palette_warning" class="menu-item">Warning palette</a>
              </li>
              <li><a href="color-palette-info.html" data-i18n="nav.color_palette.color_palette_info" class="menu-item">Info palette</a>
              </li>
              <li class="navigation-divider"></li>
              <li><a href="color-palette-red.html" data-i18n="nav.color_palette.color_palette_red" class="menu-item">Red palette</a>
              </li>
              <li><a href="color-palette-pink.html" data-i18n="nav.color_palette.color_palette_pink" class="menu-item">Pink palette</a>
              </li>
              <li><a href="color-palette-purple.html" data-i18n="nav.color_palette.color_palette_purple" class="menu-item">Purple palette</a>
              </li>
              <li><a href="color-palette-deep-purple.html" data-i18n="nav.color_palette.color_palette_deep_purple" class="menu-item">Deep Purple palette</a>
              </li>
              <li><a href="color-palette-indigo.html" data-i18n="nav.color_palette.color_palette_indigo" class="menu-item">Indigo palette</a>
              </li>
              <li><a href="color-palette-blue.html" data-i18n="nav.color_palette.color_palette_blue" class="menu-item">Blue palette</a>
              </li>
              <li><a href="color-palette-light-blue.html" data-i18n="nav.color_palette.color_palette_light_blue" class="menu-item">Light Blue palette</a>
              </li>
              <li><a href="color-palette-cyan.html" data-i18n="nav.color_palette.color_palette_cyan" class="menu-item">Cyan palette</a>
              </li>
              <li><a href="color-palette-teal.html" data-i18n="nav.color_palette.color_palette_teal" class="menu-item">Teal palette</a>
              </li>
              <li><a href="color-palette-green.html" data-i18n="nav.color_palette.color_palette_green" class="menu-item">Green palette</a>
              </li>
              <li><a href="color-palette-light-green.html" data-i18n="nav.color_palette.color_palette_light_green" class="menu-item">Light Green palette</a>
              </li>
              <li><a href="color-palette-lime.html" data-i18n="nav.color_palette.color_palette_lime" class="menu-item">Lime palette</a>
              </li>
              <li><a href="color-palette-yellow.html" data-i18n="nav.color_palette.color_palette_yellow" class="menu-item">Yellow palette</a>
              </li>
              <li><a href="color-palette-amber.html" data-i18n="nav.color_palette.color_palette_amber" class="menu-item">Amber palette</a>
              </li>
              <li><a href="color-palette-orange.html" data-i18n="nav.color_palette.color_palette_orange" class="menu-item">Orange palette</a>
              </li>
              <li><a href="color-palette-deep-orange.html" data-i18n="nav.color_palette.color_palette_deep_orange" class="menu-item">Deep Orange palette</a>
              </li>
              <li><a href="color-palette-brown.html" data-i18n="nav.color_palette.color_palette_brown" class="menu-item">Brown palette</a>
              </li>
              <li><a href="color-palette-blue-grey.html" data-i18n="nav.color_palette.color_palette_blue_grey" class="menu-item">Blue Grey palette</a>
              </li>
              <li><a href="color-palette-grey.html" data-i18n="nav.color_palette.color_palette_grey" class="menu-item">Grey palette</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="changelog.html"><i class="icon-copy"></i><span data-i18n="nav.changelog.main" class="menu-title">Changelog</span><span class="tag tag tag-pill tag-danger float-xs-right">1.0</span></a>
          </li>
          <li class="disabled nav-item"><a href="#"><i class="icon-eye-disabled"></i><span data-i18n="nav.disabled_menu.main" class="menu-title">Disabled Menu</span></a>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-android-funnel"></i><span data-i18n="nav.menu_levels.main" class="menu-title">Menu levels</span></a>
            <ul class="menu-content">
              <li><a href="#" data-i18n="nav.menu_levels.second_level" class="menu-item">Second level</a>
              </li>
              <li><a href="#" data-i18n="nav.menu_levels.second_level_child.main" class="menu-item">Second level child</a>
                <ul class="menu-content">
                  <li><a href="#" data-i18n="nav.menu_levels.second_level_child.third_level" class="menu-item">Third level</a>
                  </li>
                  <li><a href="#" data-i18n="nav.menu_levels.second_level_child.third_level_child.main" class="menu-ite"""),
format.raw("""m">Third level child</a>
                    <ul class="menu-content">
                      <li><a href="#" data-i18n="nav.menu_levels.second_level_child.third_level_child.fourth_level1" class="menu-item">Fourth level</a>
                      </li>
                      <li><a href="#" data-i18n="nav.menu_levels.second_level_child.third_level_child.fourth_level2" class="menu-item">Fourth level</a>
                      </li>
                    </ul>
                  </li>
                </ul>
              </li>
            </ul>
          </li>
          <li class=" navigation-header"><span data-i18n="nav.category.support">Support</span><i data-toggle="tooltip" data-placement="right" data-original-title="Support" class="icon-ellipsis icon-ellipsis"></i>
          </li>
          <li class=" nav-item"><a href="https://github.com/pixinvent/robust-free-bootstrap-admin-template/issues"><i class="icon-support"></i><span data-i18n="nav.support_raise_support.main" class="menu-title">Raise Support</span></a>
          </li>
          <li class=" nav-item"><a href="https://pixinvent.com/free-bootstrap-template/robust-lite/documentation"><i class="icon-document-text"></i><span data-i18n="nav.support_documentation.main" class="menu-title">Documentation</span></a>
          </li>
        </ul>
      </div>
      <!-- /main menu content-->
      <!-- main menu footer-->
      <!-- include includes/menu-footer-->
      <!-- main menu footer-->
    </div>
    <!-----------------------------/ main menu-------------------------------------->

    <div class="app-content content container-fluid">
      <div class="content-wrapper">
        <div class="content-header row">
        </div>
        <div class="content-body"><!-- stats -->



















        </div>
      </div>
    </div>
    <!-- ////////////////////////////////////////////////////////////////////////////-->


    <footer class="footer footer-static footer-light navbar-border">
      <p class="clearfix text-muted text-sm-center mb-0 px-2"><span class="float-md-left d-xs-block d-md-inline-block">Copyright  &copy; 2017 <a href="https://www.apidevops.com" target="_blank" class="text-bold-800 grey darken-2">Apidevops </a>, All rights reserved. </span><span class="float-md-right d-xs-block d-md-inline-block"><i class="icon-heart5 pink"></i></span></p>
    </footer>

    <!-- BEGIN VENDOR JS-->
    <script src='"""),_display_(/*495.19*/routes/*495.25*/.Assets.versioned("/app-assets/js/core/libraries/jquery.min.js")),format.raw/*495.89*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*496.19*/routes/*496.25*/.Assets.versioned("/app-assets/vendors/js/ui/tether.min.js")),format.raw/*496.85*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*497.19*/routes/*497.25*/.Assets.versioned("/app-assets/js/core/libraries/bootstrap.min.js")),format.raw/*497.92*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*498.19*/routes/*498.25*/.Assets.versioned("/app-assets/vendors/js/ui/perfect-scrollbar.jquery.min.js")),format.raw/*498.103*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*499.19*/routes/*499.25*/.Assets.versioned("/app-assets/vendors/js/ui/unison.min.js")),format.raw/*499.85*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*500.19*/routes/*500.25*/.Assets.versioned("/app-assets/vendors/js/ui/blockUI.min.js")),format.raw/*500.86*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*501.19*/routes/*501.25*/.Assets.versioned("/app-assets/vendors/js/ui/jquery.matchHeight-min.js")),format.raw/*501.97*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*502.19*/routes/*502.25*/.Assets.versioned("/app-assets/vendors/js/ui/screenfull.min.js" )),format.raw/*502.90*/("""'type="text/javascript"></script>
    <script src='"""),_display_(/*503.19*/routes/*503.25*/.Assets.versioned("/app-assets/vendors/js/extensions/pace.min.js")),format.raw/*503.91*/("""' type="text/javascript"></script>
    <!-- BEGIN VENDOR JS-->
    <!-- BEGIN PAGE VENDOR JS-->
    <script src='"""),_display_(/*506.19*/routes/*506.25*/.Assets.versioned("/app-assets/vendors/js/charts/chart.min.js")),format.raw/*506.88*/("""' type="text/javascript"></script>
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN ROBUST JS-->
    <script src='"""),_display_(/*509.19*/routes/*509.25*/.Assets.versioned("/app-assets/js/core/app-menu.js")),format.raw/*509.77*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*510.19*/routes/*510.25*/.Assets.versioned("/app-assets/js/core/app.js")),format.raw/*510.72*/("""' type="text/javascript"></script>
    <!-- END ROBUST JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script src='"""),_display_(/*513.19*/routes/*513.25*/.Assets.versioned("/app-assets/js/scripts/pages/dashboard-lite.js")),format.raw/*513.92*/("""' type="text/javascript"></script>
    <!-- END PAGE LEVEL JS-->
  </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jul 30 17:00:29 IST 2017
                  SOURCE: /home/dinesh/Documents/devlopment/apidevops/apidevops-play/app/views/home.scala.html
                  HASH: cec904479214dbbdc26051de07d0737bef3af1fd
                  MATRIX: 810->0|1309->472|1324->478|1407->539|1491->596|1506->602|1589->663|1675->722|1690->728|1774->790|1860->849|1875->855|1959->917|2046->977|2061->983|2138->1038|2222->1095|2237->1101|2317->1159|2616->1431|2631->1437|2703->1487|2806->1563|2821->1569|2893->1619|2973->1672|2988->1678|3084->1752|3164->1805|3179->1811|3265->1875|3401->1984|3416->1990|3497->2049|3577->2102|3592->2108|3658->2152|3738->2205|3753->2211|3822->2258|3962->2371|3977->2377|4074->2452|4154->2505|4169->2511|4274->2594|4354->2647|4369->2653|4460->2722|4600->2835|4615->2841|4678->2883|5408->3585|5424->3591|5504->3649|5548->3665|5564->3671|5644->3729|5723->3780|5739->3786|5822->3847|12460->10456|12477->10462|12569->10531|13291->11224|13308->11230|13400->11299|14107->11977|14124->11983|14216->12052|14920->12727|14937->12733|15029->12802|15932->13676|15949->13682|16041->13751|38497->36159|38513->36165|38599->36229|38680->36282|38696->36288|38778->36348|38859->36401|38875->36407|38964->36474|39045->36527|39061->36533|39162->36611|39243->36664|39259->36670|39341->36730|39422->36783|39438->36789|39521->36850|39602->36903|39618->36909|39712->36981|39793->37034|39809->37040|39896->37105|39976->37157|39992->37163|40080->37229|40222->37343|40238->37349|40323->37412|40463->37524|40479->37530|40553->37582|40634->37635|40650->37641|40719->37688|40858->37799|40874->37805|40963->37872
                  LINES: 26->1|35->10|35->10|35->10|36->11|36->11|36->11|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|40->15|40->15|40->15|45->20|45->20|45->20|47->22|47->22|47->22|48->23|48->23|48->23|49->24|49->24|49->24|52->27|52->27|52->27|53->28|53->28|53->28|54->29|54->29|54->29|57->32|57->32|57->32|58->33|58->33|58->33|59->34|59->34|59->34|62->37|62->37|62->37|73->48|73->48|73->48|73->48|73->48|73->48|73->48|73->48|73->48|142->117|142->117|142->117|150->125|150->125|150->125|158->133|158->133|158->133|166->141|166->141|166->141|176->151|176->151|176->151|521->495|521->495|521->495|522->496|522->496|522->496|523->497|523->497|523->497|524->498|524->498|524->498|525->499|525->499|525->499|526->500|526->500|526->500|527->501|527->501|527->501|528->502|528->502|528->502|529->503|529->503|529->503|532->506|532->506|532->506|535->509|535->509|535->509|536->510|536->510|536->510|539->513|539->513|539->513
                  -- GENERATED --
              */
          