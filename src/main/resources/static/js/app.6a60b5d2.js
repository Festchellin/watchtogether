(function(e){function t(t){for(var r,o,i=t[0],c=t[1],s=t[2],l=0,d=[];l<i.length;l++)o=i[l],a[o]&&d.push(a[o][0]),a[o]=0;for(r in c)Object.prototype.hasOwnProperty.call(c,r)&&(e[r]=c[r]);f&&f(t);while(d.length)d.shift()();return u.push.apply(u,s||[]),n()}function n(){for(var e,t=0;t<u.length;t++){for(var n=u[t],r=!0,o=1;o<n.length;o++){var i=n[o];0!==a[i]&&(r=!1)}r&&(u.splice(t--,1),e=c(c.s=n[0]))}return e}var r={},o={app:0},a={app:0},u=[];function i(e){return c.p+"js/"+({about:"about"}[e]||e)+"."+{about:"242f85ad","chunk-25540f96":"cb4053ed","chunk-257daf35":"83a21fc6","chunk-2d0c2318":"a73debf0","chunk-2d0e2687":"408c57db","chunk-2d21eb29":"5b1c3fe0","chunk-2d2308d5":"7e0e61c6","chunk-3573fe09":"b20ebea7","chunk-837f6c82":"10a4eed7","chunk-901b4e3e":"d5edc71d","chunk-e72ab5b4":"102af552","chunk-e72dca72":"dd0f1c9d","chunk-e754613c":"0702e0c7"}[e]+".js"}function c(t){if(r[t])return r[t].exports;var n=r[t]={i:t,l:!1,exports:{}};return e[t].call(n.exports,n,n.exports,c),n.l=!0,n.exports}c.e=function(e){var t=[],n={"chunk-25540f96":1,"chunk-3573fe09":1};o[e]?t.push(o[e]):0!==o[e]&&n[e]&&t.push(o[e]=new Promise(function(t,n){for(var r="css/"+({about:"about"}[e]||e)+"."+{about:"31d6cfe0","chunk-25540f96":"07bd66bd","chunk-257daf35":"31d6cfe0","chunk-2d0c2318":"31d6cfe0","chunk-2d0e2687":"31d6cfe0","chunk-2d21eb29":"31d6cfe0","chunk-2d2308d5":"31d6cfe0","chunk-3573fe09":"07bd66bd","chunk-837f6c82":"31d6cfe0","chunk-901b4e3e":"31d6cfe0","chunk-e72ab5b4":"31d6cfe0","chunk-e72dca72":"31d6cfe0","chunk-e754613c":"31d6cfe0"}[e]+".css",a=c.p+r,u=document.getElementsByTagName("link"),i=0;i<u.length;i++){var s=u[i],l=s.getAttribute("data-href")||s.getAttribute("href");if("stylesheet"===s.rel&&(l===r||l===a))return t()}var d=document.getElementsByTagName("style");for(i=0;i<d.length;i++){s=d[i],l=s.getAttribute("data-href");if(l===r||l===a)return t()}var f=document.createElement("link");f.rel="stylesheet",f.type="text/css",f.onload=t,f.onerror=function(t){var r=t&&t.target&&t.target.src||a,u=new Error("Loading CSS chunk "+e+" failed.\n("+r+")");u.request=r,delete o[e],f.parentNode.removeChild(f),n(u)},f.href=a;var p=document.getElementsByTagName("head")[0];p.appendChild(f)}).then(function(){o[e]=0}));var r=a[e];if(0!==r)if(r)t.push(r[2]);else{var u=new Promise(function(t,n){r=a[e]=[t,n]});t.push(r[2]=u);var s,l=document.createElement("script");l.charset="utf-8",l.timeout=120,c.nc&&l.setAttribute("nonce",c.nc),l.src=i(e),s=function(t){l.onerror=l.onload=null,clearTimeout(d);var n=a[e];if(0!==n){if(n){var r=t&&("load"===t.type?"missing":t.type),o=t&&t.target&&t.target.src,u=new Error("Loading chunk "+e+" failed.\n("+r+": "+o+")");u.type=r,u.request=o,n[1](u)}a[e]=void 0}};var d=setTimeout(function(){s({type:"timeout",target:l})},12e4);l.onerror=l.onload=s,document.head.appendChild(l)}return Promise.all(t)},c.m=e,c.c=r,c.d=function(e,t,n){c.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:n})},c.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},c.t=function(e,t){if(1&t&&(e=c(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var n=Object.create(null);if(c.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var r in e)c.d(n,r,function(t){return e[t]}.bind(null,r));return n},c.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return c.d(t,"a",t),t},c.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},c.p="/",c.oe=function(e){throw console.error(e),e};var s=window["webpackJsonp"]=window["webpackJsonp"]||[],l=s.push.bind(s);s.push=t,s=s.slice();for(var d=0;d<s.length;d++)t(s[d]);var f=l;u.push([0,"chunk-vendors"]),n()})({0:function(e,t,n){e.exports=n("56d7")},"011d":function(e,t,n){},"034f":function(e,t,n){"use strict";var r=n("64a9"),o=n.n(r);o.a},"03e6":function(e,t,n){"use strict";var r=n("cebc"),o=(n("96cf"),n("3b8d")),a=n("561e");t["a"]={getById:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t,n){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,a["a"].fetch("".concat(n).concat(t));case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}},e,this)}));function t(t,n){return e.apply(this,arguments)}return t}(),update:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t,n){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,a["a"].put("".concat(n),t);case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}},e,this)}));function t(t,n){return e.apply(this,arguments)}return t}(),deleteById:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t,n){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,a["a"].delete("".concat(n).concat(t));case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}},e,this)}));function t(t,n){return e.apply(this,arguments)}return t}(),save:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t,n){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,a["a"].post("".concat(n),t);case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}},e,this)}));function t(t,n){return e.apply(this,arguments)}return t}(),getListByCondition:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(){var t,n,o,u,i=arguments;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return t=i.length>0&&void 0!==i[0]?i[0]:{},n=i.length>1&&void 0!==i[1]?i[1]:0,o=i.length>2&&void 0!==i[2]?i[2]:5,u=i.length>3?i[3]:void 0,e.next=6,a["a"].fetch("".concat(u),Object(r["a"])({},t,{page:n,pageSize:o}));case 6:return e.abrupt("return",e.sent);case 7:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}(),getList:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,a["a"].fetch("".concat(t));case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),get:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t,n){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,a["a"].fetch("".concat(t),n);case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}},e,this)}));function t(t,n){return e.apply(this,arguments)}return t}()}},"1ba5":function(e,t,n){},"29b8":function(e,t,n){"use strict";var r=n("dceb"),o=n.n(r);o.a},"561e":function(e,t,n){"use strict";var r=n("795b"),o=n.n(r),a=n("bc3a"),u=n.n(a);t["a"]={fetch:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{};return new o.a(function(n,r){u.a.get(e,{params:t}).then(function(e){n(e.data)}).catch(function(e){r(e)})})},post:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{};return new o.a(function(n,r){u.a.post(e,t).then(function(e){n(e.data)},function(e){r(e)})})},patch:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{};return new o.a(function(n,r){u.a.patch(e,t).then(function(e){n(e.data)},function(e){r(e)})})},put:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{};return new o.a(function(n,r){u.a.put(e,t).then(function(e){n(e.data)},function(e){r(e)})})},delete:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{};return new o.a(function(n,r){u.a.delete(e,t).then(function(e){n(e.data)})})}},u.a.defaults.timeout=5e3,u.a.interceptors.request.use(function(e){return e.proxy={host:"127.0.0.1",port:8888},e.headers={"Content-Type":"application/json;charset=UTF-8"},e},function(e){return o.a.reject(e)}),u.a.interceptors.response.use(function(e){return e},function(e){if(e&&e.response)switch(e.response.status){case 400:console.log("错误请求");break;case 401:console.log("未授权，请重新登录");break;case 403:console.log("拒绝访问");break;case 404:console.log("请求错误,未找到该资源");break;case 405:console.log("请求方法未允许");break;case 408:console.log("请求超时");break;case 500:console.log("服务器端出错");break;case 501:console.log("网络未实现");break;case 502:console.log("网络错误");break;case 503:console.log("服务不可用");break;case 504:console.log("网络超时");break;case 505:console.log("http版本不支持该请求");break;default:console.log("连接错误".concat(e.response.status))}else console.log("连接到服务器失败");return o.a.resolve(e.response)})},5635:function(e,t,n){"use strict";var r=n("011d"),o=n.n(r);o.a},"56d7":function(e,t,n){"use strict";n.r(t);n("7f7f"),n("cadf"),n("551c"),n("f751"),n("097d");var r=n("2b0e"),o=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{attrs:{id:"app"}},[n("router-view")],1)},a=[],u=(n("96cf"),n("3b8d")),i=n("d491"),c={mounted:function(){var e=Object(u["a"])(regeneratorRuntime.mark(function e(){var t,n;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:if(t=localStorage.getItem("userToken"),!t){e.next=6;break}return e.next=4,i["a"].signInWithToken(t).catch(function(e){console.log(e)});case 4:n=e.sent,n.success&&(this.$store.commit("setUserToken",n.data.userToken),this.$store.commit("setUser",n.data.user));case 6:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}()},s=c,l=(n("034f"),n("2877")),d=Object(l["a"])(s,o,a,!1,null,null,null),f=d.exports,p=n("8c4f"),h=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("el-container",[n("el-header",[n("mvod-header",{attrs:{user:this.$store.getters.getUser}})],1),n("el-row",{staticClass:"mvod-content",attrs:{align:"center",justify:"center",type:"flex"}},[n("el-col",{staticStyle:{"margin-left":"1%"},attrs:{span:17}},[this.$store.getters.getShowHomeCarousel?n("el-card",[n("el-row",{attrs:{align:"middle",justify:"center",type:"flex"}},[n("el-col",[n("el-row",{attrs:{align:"middle",justify:"center",type:"flex"}},[n("el-col",[n("mvod-carousel")],1)],1)],1)],1)],1):e._e(),this.$store.getters.getVideos.length>0?n("div",e._l(this.$store.getters.getVideos,function(e,t){return n("mvod-video-simple",{key:t,attrs:{video:e}})}),1):n("div",{staticClass:"mvod-align-center"},[n("el-card",[e._v("\n                    no results found.\n                ")])],1)],1)],1),n("el-footer",[n("mvod-footer")],1)],1)},m=[],v=n("a3c9"),g=n("d3d3"),b=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("el-carousel",{attrs:{"indicator-position":"outside",type:"card",trigger:"click",autoplay:!1}},e._l(e.videos,function(e,t){return n("el-carousel-item",{key:t},[n("mvod-video",{attrs:{video:e}})],1)}),1)},y=[],w=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticStyle:{position:"relative"}},[n("div",{staticClass:"des"},[n("h3",[e._v(e._s(e.video.name))])]),n("div",[n("video",{ref:e.video,attrs:{poster:e.video.poster,src:e.video.url,width:"80%"},on:{click:function(t){return e.navigateToVideo(e.video)},mouseover:function(t){return e.playVideo(e.video)},mouseleave:function(t){return e.pauseVideo(e.video)}}},[e._v("\n            你的浏览器不支持该标签，请使用现代浏览器\n        ")])])])},k=[],x={name:"MvodVideo",props:["video"],methods:{playVideo:function(e){this.$refs[e].play()},pauseVideo:function(e){this.$refs[e].pause()},navigateToVideo:function(e){console.log(e),this.$router.push({path:"video",query:{video_id:e.id}})}}},j=x,R=(n("d1f4"),Object(l["a"])(j,w,k,!1,null,"0b0839a5",null)),O=R.exports,M=n("03e6"),C={name:"MvodCarousel",components:{MvodVideo:O},data:function(){return{videos:[]}},methods:{getData:function(){var e=Object(u["a"])(regeneratorRuntime.mark(function e(){var t;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,M["a"].getListByCondition({},0,4,"/video");case 2:t=e.sent,t.success&&(this.videos=t.data.list);case 4:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}()},mounted:function(){var e=Object(u["a"])(regeneratorRuntime.mark(function e(){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.getData();case 2:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}()},_=C,$=Object(l["a"])(_,b,y,!1,null,"c6faadd0",null),T=$.exports,V=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("el-card",{staticClass:"mvod-video-simple"},[n("el-row",{attrs:{gutter:20}},[n("el-col",{staticClass:"mvod-align-center",attrs:{span:8}},[n("video",{ref:e.video,attrs:{controls:"",src:e.video.url,muted:"",width:"100%"},domProps:{muted:!0},on:{mouseover:function(t){return e.playVideo(e.video)},mouseleave:function(t){return e.pauseVideo(e.video)}}},[e._v("\n                You browser do not support video tag\n            ")])]),n("el-col",{attrs:{span:16}},[n("h2",{staticClass:"video-name",on:{click:function(t){return e.navigateToVideo(e.video)}}},[e._v("\n                    "+e._s(e.video.name)+"\n            ")]),n("p",{staticClass:"video-description"},[e._v(e._s(e.video.description.substr(0,100)+"..."))])])],1)],1)},S=[],U={name:"MvodVideoSimple",props:["video"],methods:{playVideo:function(e){this.$refs[e].play()},pauseVideo:function(e){this.$refs[e].pause()},navigateToVideo:function(e){this.$router.push({path:"video",query:{video_id:e.id}})}}},A=U,I=Object(l["a"])(A,V,S,!1,null,"4ce8d0cf",null),E=I.exports,B={name:"home",components:{MvodVideoSimple:E,MvodCarousel:T,MvodFooter:g["a"],MvodHeader:v["a"]},data:function(){return{subMenus:[],videos:[]}},methods:{getData:function(){var e=Object(u["a"])(regeneratorRuntime.mark(function e(t,n,r){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.$store.dispatch("setVideosAsync",{condition:t,page:n,pageSize:r});case 2:case"end":return e.stop()}},e,this)}));function t(t,n,r){return e.apply(this,arguments)}return t}()},mounted:function(){var e=Object(u["a"])(regeneratorRuntime.mark(function e(){var t,n;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return t=this.$store.getters.getQuery,console.log(t),n={},""!==t&&(n={conditionName:"name",conditionValue:t}),e.next=6,this.getData(n,0,10);case 6:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}()},L=B,q=(n("cccb"),Object(l["a"])(L,h,m,!1,null,null,null)),H=q.exports;r["default"].use(p["a"]);var P=new p["a"]({mode:"history",base:"/",routes:[{path:"/",name:"home",component:H},{path:"/video",name:"video",component:function(){return n.e("about").then(n.bind(null,"e01f"))}},{path:"/login",name:"login",component:function(){return n.e("chunk-e72dca72").then(n.bind(null,"af20"))}},{path:"/user",name:"user",component:function(){return n.e("chunk-3573fe09").then(n.bind(null,"582d"))},children:[{path:"modify",name:"modify",component:function(){return n.e("chunk-2d2308d5").then(n.bind(null,"ed88"))},children:[{path:"password",name:"user-modify-password",component:function(){return n.e("chunk-e72ab5b4").then(n.bind(null,"f42f"))}},{path:"user",name:"user-modify-userInfo",component:function(){return n.e("chunk-901b4e3e").then(n.bind(null,"2c63"))}}]},{path:"video",name:"user-video",component:function(){return n.e("chunk-257daf35").then(n.bind(null,"7ef2"))}}]},{path:"/admin",name:"admin",component:function(){return n.e("chunk-25540f96").then(n.bind(null,"ae49"))},children:[{path:"user-admin",name:"admin-user",component:function(){return n.e("chunk-e754613c").then(n.bind(null,"8985"))}},{path:"category",name:"admin-category",component:function(){return n.e("chunk-837f6c82").then(n.bind(null,"f820"))}},{path:"table",name:"admin-table",component:function(){return n.e("chunk-2d0e2687").then(n.bind(null,"7f24"))}},{path:"userInfo",name:"admin-userInfo",component:function(){return n.e("chunk-2d21eb29").then(n.bind(null,"d755"))}},{path:"userLog",name:"admin-userLog",component:function(){return n.e("chunk-2d0c2318").then(n.bind(null,"48ec"))}},{path:"vote",name:"admin-vote",component:function(){return n.e("chunk-837f6c82").then(n.bind(null,"f820"))}},{path:"video",name:"admin-video",component:function(){return n.e("chunk-837f6c82").then(n.bind(null,"f820"))}}]}]}),N=n("cebc"),z=n("2f62");r["default"].use(z["a"]);var F=new z["a"].Store({state:{userToken:null,user:null,categoryMenu:null,adminMenu:null,userMenu:null,menu:null,videos:[],showHomeCarousel:!0,query:""},getters:{isSignIn:function(e){return null!=e.userToken&&null!=e.user},getUserToken:function(e){return e.userToken},getUser:function(e){return e.user},getCategoryMenu:function(e){return e.categoryMenu},getAdminMenu:function(e){return e.adminMenu},getUserMenu:function(e){return e.userMenu},getAllMenu:function(e){return e.menu},getVideos:function(e){return e.videos},getShowHomeCarousel:function(e){return e.showHomeCarousel},getQuery:function(e){return e.query}},mutations:{setUserToken:function(e,t){e.userToken=t},clearSignInInformation:function(e){e.userToken=null,e.user=null},setUser:function(e,t){e.user=t},setCategoryMenu:function(e,t){e.categoryMenu=t},setAdminMenu:function(e,t){e.adminMenu=t},setUserMenu:function(e,t){e.userMenu=t},setMenu:function(e,t){e.menu=t},setVideos:function(e,t){e.videos=t},setShowHomeCarousel:function(e,t){e.showHomeCarousel=t},setQuery:function(e,t){e.query=t}},actions:{setVideos:function(e,t){e.commit("setVideos",t)},setVideosAsync:function(){var e=Object(u["a"])(regeneratorRuntime.mark(function e(t,n){var r,o,a,u,i;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return r=n.condition,o=n.page,a=n.pageSize,e.next=3,M["a"].getListByCondition(Object(N["a"])({},r),o,a,"/video");case 3:u=e.sent,u.success&&(i=u.data.list,t.commit("setVideos",i));case 5:case"end":return e.stop()}},e,this)}));function t(t,n){return e.apply(this,arguments)}return t}(),setUserTokenAsync:function(e,t){e.commit("setUserToken",t)},setCategoryMenuAsync:function(){var e=Object(u["a"])(regeneratorRuntime.mark(function e(t){var n,r;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:if(t.state.categoryMenu){e.next=5;break}return e.next=3,M["a"].getListByCondition({},0,100,"/category");case 3:n=e.sent,n.success&&(r={id:1,title:"By Category",items:n.data.categories},t.commit("setCategoryMenu",r));case 5:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),setAdminMenu:function(e,t){e.commit("setAdminMenu",t)},setAdminMenuAsync:function(){var e=Object(u["a"])(regeneratorRuntime.mark(function e(t){var n,r;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,M["a"].getList("/table?type=2");case 2:n=e.sent,n.success&&(r=n.data.tables,t.commit("setAdminMenu",r));case 4:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),setUserMenu:function(e,t){e.commit("setUserMenu",t)},setUserMenuAsync:function(){var e=Object(u["a"])(regeneratorRuntime.mark(function e(t){var n,r;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,M["a"].getList("/table?type=1");case 2:n=e.sent,n.success&&(r=n.data.tables,t.commit("setUserMenu",r));case 4:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),setMenu:function(e,t){e.commit("setUserMenu",t)},setMenuAsync:function(){var e=Object(u["a"])(regeneratorRuntime.mark(function e(t){var n,r;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,M["a"].getList("/table?type=3");case 2:n=e.sent,n.success&&(r=n.data.tables,t.commit("setMenu",r));case 4:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}()}}),D=n("9483");Object(D["a"])("".concat("/","service-worker.js"),{ready:function(){console.log("App is being served from cache by a service worker.\nFor more details, visit https://goo.gl/AFskqB")},registered:function(){console.log("Service worker has been registered.")},cached:function(){console.log("Content has been cached for offline use.")},updatefound:function(){console.log("New content is downloading.")},updated:function(){console.log("New content is available; please refresh.")},offline:function(){console.log("No internet connection found. App is running in offline mode.")},error:function(e){console.error("Error during service worker registration:",e)}});var Q=n("5c96"),W=n.n(Q),J=(n("0fae"),n("561e"));r["default"].config.productionTip=!1,r["default"].use(W.a),r["default"].prototype.$http=J["a"],P.beforeEach(function(e,t,n){console.log(e.name,n.name),(e.name.indexOf("admin")>-1||e.name.indexOf("user")>-1)&&(F.getters.isSignIn?n():(console.log("not sign in"),P.push("login"))),n()}),new r["default"]({router:P,store:F,render:function(e){return e(f)}}).$mount("#app")},"64a9":function(e,t,n){},a3c9:function(e,t,n){"use strict";var r=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("el-card",[n("el-row",{attrs:{justify:"center",type:"flex"}},[n("el-col",{attrs:{span:16}},[n("el-row",{attrs:{align:"middle",justify:"center",type:"flex"}},[n("el-col",{attrs:{span:6}},[n("h1",{staticClass:"logo",on:{click:e.navigateToHome}},[e._v("Mvod")])]),n("el-col",{attrs:{span:8}},[n("el-input",{attrs:{clearable:"",placeholder:"search video"},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.searchVideo(t)}},model:{value:e.query,callback:function(t){e.query=t},expression:"query"}})],1),e.user?n("el-col",{attrs:{offset:1,span:7}},[n("el-button",{attrs:{type:"text"},on:{click:e.navigateToUserCenter}},[e._v("\n                        "+e._s(e.user.name||e.user.account)+"\n                    ")]),n("el-button",{on:{click:e.signOut}},[e._v("Sign out")])],1):n("el-col",{attrs:{offset:1,span:7}},[n("el-menu",{attrs:{router:!0,"active-text-color":"#303133",mode:"horizontal"}},[n("el-menu-item",{attrs:{index:"login"}},[e._v("Login")])],1)],1)],1)],1)],1)],1)},o=[],a=(n("96cf"),n("3b8d")),u=(n("a481"),n("03e6")),i={name:"MvodHeader",props:["user"],data:function(){return{query:""}},computed:{video:function(){return this.query||this.$store.getters.getQuery}},methods:{signOut:function(){this.$store.commit("clearSignInInformation"),localStorage.clear(),this.$router.replace("/")},navigateToUserCenter:function(){this.user.adminRole?this.$router.push("admin"):this.$router.push("user")},navigateToHome:function(){this.$router.push("/")},searchVideo:function(){var e=Object(a["a"])(regeneratorRuntime.mark(function e(){var t,n;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:if(""===this.video){e.next=7;break}return e.next=3,u["a"].getListByCondition({conditionName:"name",conditionValue:this.video},0,10,"/video");case 3:t=e.sent,t.success&&(n=t.data.list,this.$store.commit("setQuery",this.video),this.$store.commit("setVideos",n),this.$store.commit("setShowHomeCarousel",!1),this.$router.push("/")),e.next=10;break;case 7:return e.next=9,this.$store.dispatch("setVideosAsync",{page:0,pageSize:10});case 9:this.$store.commit("setShowHomeCarousel",!0);case 10:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}()}},c=i,s=(n("5635"),n("2877")),l=Object(s["a"])(c,r,o,!1,null,"cd149886",null);t["a"]=l.exports},cccb:function(e,t,n){"use strict";var r=n("d563"),o=n.n(r);o.a},d1f4:function(e,t,n){"use strict";var r=n("1ba5"),o=n.n(r);o.a},d3d3:function(e,t,n){"use strict";var r=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"footer-wrapper"},[n("el-row",{staticClass:"mvod-bottom-1 mvod-width-95",attrs:{align:"middle",justify:"center",type:"flex"}},[n("el-col",{attrs:{span:12}},[n("p",{staticClass:"copyright text-align-center"},[e._v("Copyright © Mvod "+e._s((new Date).getFullYear()))])])],1)],1)},o=[],a={name:"MvodFooter"},u=a,i=(n("29b8"),n("2877")),c=Object(i["a"])(u,r,o,!1,null,"6841ce51",null);t["a"]=c.exports},d491:function(e,t,n){"use strict";var r=n("cebc"),o=(n("96cf"),n("3b8d")),a=n("561e"),u="/user/";t["a"]={getUserById:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,a["a"].fetch("".concat(u).concat(t));case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),updateUser:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,a["a"].put("".concat(u),t);case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),deleteUserById:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,a["a"].delete("".concat(u).concat(t));case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),saveUser:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,a["a"].post("".concat(u,"signUp"),t);case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),getUserListByCondition:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(){var t,n,o,i=arguments;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return t=i.length>0&&void 0!==i[0]?i[0]:{},n=i.length>1&&void 0!==i[1]?i[1]:0,o=i.length>2&&void 0!==i[2]?i[2]:5,e.next=5,a["a"].fetch("".concat(u),Object(r["a"])({},t,{page:n,pageSize:o}));case 5:return e.abrupt("return",e.sent);case 6:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}(),signIn:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,a["a"].post("".concat(u,"signIn"),t);case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),signInWithToken:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,a["a"].post("".concat(u,"signInWithToken"),t);case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),signUp:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,a["a"].post(" ".concat(u,"signUp"),t);case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),userExist:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t){var n;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.prev=0,e.next=3,a["a"].fetch("".concat(u,"exist"),{account:t});case 3:if(n=e.sent,!n.success){e.next=8;break}return e.abrupt("return",n.data.exist);case 8:return e.abrupt("return",!1);case 9:e.next=14;break;case 11:e.prev=11,e.t0=e["catch"](0),console.log(e.t0.message);case 14:case"end":return e.stop()}},e,this,[[0,11]])}));function t(t){return e.apply(this,arguments)}return t}()}},d563:function(e,t,n){},dceb:function(e,t,n){}});
//# sourceMappingURL=app.6a60b5d2.js.map