(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-901b4e3e"],{"10ff":function(e,t,r){var n=r("e53d").parseFloat,a=r("a1ce").trim;e.exports=1/n(r("e692")+"-0")!==-1/0?function(e){var t=a(String(e),3),r=n(t);return 0===r&&"-"==t.charAt(0)?-0:r}:n},"2c63":function(e,t,r){"use strict";r.r(t);var n=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[r("el-form",{ref:"user",attrs:{inline:""},model:{value:this.$store.getters.getUser,callback:function(t){e.$set(this.$store.getters,"getUser",t)},expression:"this.$store.getters.getUser"}},[r("el-form-item",{attrs:{label:"Name"}},[r("el-input",{model:{value:this.$store.getters.getUser.name,callback:function(t){e.$set(this.$store.getters.getUser,"name",t)},expression:"this.$store.getters.getUser.name"}})],1),r("el-form-item",{attrs:{label:"account"}},[r("el-input",{model:{value:this.$store.getters.getUser.account,callback:function(t){e.$set(this.$store.getters.getUser,"account",t)},expression:"this.$store.getters.getUser.account"}})],1),r("el-button",{on:{click:function(t){return e.save("user")}}},[e._v("Save")])],1),r("el-form",{ref:"userInfo",attrs:{model:e.userInfo}},[r("el-form-item",{attrs:{prop:e.userInfo.avatar,label:"Avatar"}},[e.showPic?r("img",{staticClass:"mvod-avatar",attrs:{src:e.userInfo.avatar}}):e._e(),r("mvod-file-upload",{attrs:{accept:"image/jpeg,image/gif,image/png",url:"/upload/image"},on:{onUploadSuccess:e.handleUploadSuccess}})],1),r("el-form-item",{attrs:{prop:e.userInfo.email,label:"email"}},[r("el-input",{model:{value:e.userInfo.email,callback:function(t){e.$set(e.userInfo,"email",t)},expression:"userInfo.email"}})],1),r("el-form-item",{attrs:{prop:e.userInfo.phoneNumber,label:"Phone"}},[r("el-input",{model:{value:e.userInfo.phoneNumber,callback:function(t){e.$set(e.userInfo,"phoneNumber",t)},expression:"userInfo.phoneNumber"}})],1),r("el-form-item",{attrs:{label:"Register Date"}},[r("el-date-picker",{attrs:{value:e.userInfo.registerDate,placeholder:"Choose...",readonly:"",type:"datetime"}})],1),r("el-form-item",{attrs:{label:"Last Modify Time"}},[r("el-date-picker",{attrs:{value:e.userInfo.lastModifyTime,placeholder:"Choose...",readonly:"",type:"datetime"}})],1),r("el-button",{attrs:{type:"primary"},on:{click:function(t){return e.save("userInfo")}}},[e._v("Save")])],1)],1)},a=[],s=r("cebc"),o=(r("96cf"),r("3b8d")),i=r("03e6"),u=r("dc65"),c={name:"MvodUserInfo",components:{MvodFileUpload:u["a"]},data:function(){return{userInfo:{id:"",user:null,avatar:"",registerDate:"",lastModifyTime:"",email:"",phoneNumber:""}}},computed:{showPic:function(){return!!this.userInfo.avatar}},methods:{handleRemove:function(){this.userInfo.avatar="",this.hidden=!0},save:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t){var r,n;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:e.t0=t,e.next="user"===e.t0?3:"userInfo"===e.t0?5:19;break;case 3:return console.log("user"),e.abrupt("break",19);case 5:return console.log("info"),r=this.$store.getters.getUser,this.userInfo.user=Object(s["a"])({},r),e.next=10,i["a"].update(this.userInfo,"/userInfo");case 10:if(n=e.sent,!n.success){e.next=17;break}return e.next=14,this.getUserInfo();case 14:this.$message.success(n.message),e.next=18;break;case 17:this.$message.error(n.message);case 18:return e.abrupt("break",19);case 19:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),getUserInfo:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(){var t,r;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return t=this.$store.getters.getUser,e.next=3,i["a"].getById(t.id,"/userInfo/");case 3:r=e.sent,r.success&&(this.userInfo=r.data.info);case 5:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}(),beforeAvatarUpload:function(e){var t=e.type.indexOf("image")>-1,r=e.size/1024/1024<2;return t||this.$message.error("only accept image files!"),r||this.$message.error("picture size should less than 2MB"),t&&r},handleUploadSuccess:function(e){console.log(e),this.userInfo.avatar=e.data.url},handleExceed:function(){this.$message.error("only accept one picture please remove and continue")}},mounted:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.getUserInfo();case 2:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}()},l=c,f=r("2877"),p=Object(f["a"])(l,n,a,!1,null,"493f930c",null);t["default"]=p.exports},"4fcb":function(e,t,r){var n=r("63b6"),a=r("10ff");n(n.S+n.F*(Number.parseFloat!=a),"Number",{parseFloat:a})},"69b9":function(e,t,r){r("4fcb"),e.exports=r("584a").Number.parseFloat},"82a3":function(e,t,r){e.exports=r("69b9")},"8d81":function(e,t,r){var n;(function(a){"use strict";function s(e,t){var r=(65535&e)+(65535&t),n=(e>>16)+(t>>16)+(r>>16);return n<<16|65535&r}function o(e,t){return e<<t|e>>>32-t}function i(e,t,r,n,a,i){return s(o(s(s(t,e),s(n,i)),a),r)}function u(e,t,r,n,a,s,o){return i(t&r|~t&n,e,t,a,s,o)}function c(e,t,r,n,a,s,o){return i(t&n|r&~n,e,t,a,s,o)}function l(e,t,r,n,a,s,o){return i(t^r^n,e,t,a,s,o)}function f(e,t,r,n,a,s,o){return i(r^(t|~n),e,t,a,s,o)}function p(e,t){var r,n,a,o,i;e[t>>5]|=128<<t%32,e[14+(t+64>>>9<<4)]=t;var p=1732584193,m=-271733879,d=-1732584194,h=271733878;for(r=0;r<e.length;r+=16)n=p,a=m,o=d,i=h,p=u(p,m,d,h,e[r],7,-680876936),h=u(h,p,m,d,e[r+1],12,-389564586),d=u(d,h,p,m,e[r+2],17,606105819),m=u(m,d,h,p,e[r+3],22,-1044525330),p=u(p,m,d,h,e[r+4],7,-176418897),h=u(h,p,m,d,e[r+5],12,1200080426),d=u(d,h,p,m,e[r+6],17,-1473231341),m=u(m,d,h,p,e[r+7],22,-45705983),p=u(p,m,d,h,e[r+8],7,1770035416),h=u(h,p,m,d,e[r+9],12,-1958414417),d=u(d,h,p,m,e[r+10],17,-42063),m=u(m,d,h,p,e[r+11],22,-1990404162),p=u(p,m,d,h,e[r+12],7,1804603682),h=u(h,p,m,d,e[r+13],12,-40341101),d=u(d,h,p,m,e[r+14],17,-1502002290),m=u(m,d,h,p,e[r+15],22,1236535329),p=c(p,m,d,h,e[r+1],5,-165796510),h=c(h,p,m,d,e[r+6],9,-1069501632),d=c(d,h,p,m,e[r+11],14,643717713),m=c(m,d,h,p,e[r],20,-373897302),p=c(p,m,d,h,e[r+5],5,-701558691),h=c(h,p,m,d,e[r+10],9,38016083),d=c(d,h,p,m,e[r+15],14,-660478335),m=c(m,d,h,p,e[r+4],20,-405537848),p=c(p,m,d,h,e[r+9],5,568446438),h=c(h,p,m,d,e[r+14],9,-1019803690),d=c(d,h,p,m,e[r+3],14,-187363961),m=c(m,d,h,p,e[r+8],20,1163531501),p=c(p,m,d,h,e[r+13],5,-1444681467),h=c(h,p,m,d,e[r+2],9,-51403784),d=c(d,h,p,m,e[r+7],14,1735328473),m=c(m,d,h,p,e[r+12],20,-1926607734),p=l(p,m,d,h,e[r+5],4,-378558),h=l(h,p,m,d,e[r+8],11,-2022574463),d=l(d,h,p,m,e[r+11],16,1839030562),m=l(m,d,h,p,e[r+14],23,-35309556),p=l(p,m,d,h,e[r+1],4,-1530992060),h=l(h,p,m,d,e[r+4],11,1272893353),d=l(d,h,p,m,e[r+7],16,-155497632),m=l(m,d,h,p,e[r+10],23,-1094730640),p=l(p,m,d,h,e[r+13],4,681279174),h=l(h,p,m,d,e[r],11,-358537222),d=l(d,h,p,m,e[r+3],16,-722521979),m=l(m,d,h,p,e[r+6],23,76029189),p=l(p,m,d,h,e[r+9],4,-640364487),h=l(h,p,m,d,e[r+12],11,-421815835),d=l(d,h,p,m,e[r+15],16,530742520),m=l(m,d,h,p,e[r+2],23,-995338651),p=f(p,m,d,h,e[r],6,-198630844),h=f(h,p,m,d,e[r+7],10,1126891415),d=f(d,h,p,m,e[r+14],15,-1416354905),m=f(m,d,h,p,e[r+5],21,-57434055),p=f(p,m,d,h,e[r+12],6,1700485571),h=f(h,p,m,d,e[r+3],10,-1894986606),d=f(d,h,p,m,e[r+10],15,-1051523),m=f(m,d,h,p,e[r+1],21,-2054922799),p=f(p,m,d,h,e[r+8],6,1873313359),h=f(h,p,m,d,e[r+15],10,-30611744),d=f(d,h,p,m,e[r+6],15,-1560198380),m=f(m,d,h,p,e[r+13],21,1309151649),p=f(p,m,d,h,e[r+4],6,-145523070),h=f(h,p,m,d,e[r+11],10,-1120210379),d=f(d,h,p,m,e[r+2],15,718787259),m=f(m,d,h,p,e[r+9],21,-343485551),p=s(p,n),m=s(m,a),d=s(d,o),h=s(h,i);return[p,m,d,h]}function m(e){var t,r="",n=32*e.length;for(t=0;t<n;t+=8)r+=String.fromCharCode(e[t>>5]>>>t%32&255);return r}function d(e){var t,r=[];for(r[(e.length>>2)-1]=void 0,t=0;t<r.length;t+=1)r[t]=0;var n=8*e.length;for(t=0;t<n;t+=8)r[t>>5]|=(255&e.charCodeAt(t/8))<<t%32;return r}function h(e){return m(p(d(e),8*e.length))}function g(e,t){var r,n,a=d(e),s=[],o=[];for(s[15]=o[15]=void 0,a.length>16&&(a=p(a,8*e.length)),r=0;r<16;r+=1)s[r]=909522486^a[r],o[r]=1549556828^a[r];return n=p(s.concat(d(t)),512+8*t.length),m(p(o.concat(n),640))}function v(e){var t,r,n="0123456789abcdef",a="";for(r=0;r<e.length;r+=1)t=e.charCodeAt(r),a+=n.charAt(t>>>4&15)+n.charAt(15&t);return a}function b(e){return unescape(encodeURIComponent(e))}function x(e){return h(b(e))}function I(e){return v(x(e))}function k(e,t){return g(b(e),b(t))}function $(e,t){return v(k(e,t))}function w(e,t,r){return t?r?k(t,e):$(t,e):r?x(e):I(e)}n=function(){return w}.call(t,r,t,e),void 0===n||(e.exports=n)})()},a1ce:function(e,t,r){var n=r("63b6"),a=r("25eb"),s=r("294c"),o=r("e692"),i="["+o+"]",u="​",c=RegExp("^"+i+i+"*"),l=RegExp(i+i+"*$"),f=function(e,t,r){var a={},i=s(function(){return!!o[e]()||u[e]()!=u}),c=a[e]=i?t(p):o[e];r&&(a[r]=c),n(n.P+n.F*i,"String",a)},p=f.trim=function(e,t){return e=String(a(e)),1&t&&(e=e.replace(c,"")),2&t&&(e=e.replace(l,"")),e};e.exports=f},dc65:function(e,t,r){"use strict";var n=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[e.files.length>0?r("div",e._l(e.files,function(t){return r("div",{key:t.name,staticClass:"mvod-margin-top-1"},[r("el-card",[r("el-row",[r("el-row",{attrs:{align:"middle"}},[r("el-col",[e._v("\n                            "+e._s(t.name)+"\n                            "),r("el-progress",{attrs:{percentage:e.percentage}})],1)],1)],1)],1)],1)}),0):e._e(),r("div",{staticClass:"mvod-margin-top-1"},[r("el-card",[r("el-row",[r("el-row",{attrs:{align:"middle"}},[r("form",{ref:"form",attrs:{enctype:"multipart/form-data",id:"form"}},[r("el-col",{attrs:{span:12}},[r("el-button",{attrs:{type:"primary"},on:{click:e.chooseFile}},[e._v("Choose...")]),r("input",{ref:"file",staticClass:"mvod-hidden",attrs:{type:"file",accept:e.accept||"*"},on:{change:function(t){return e.fileChange(t.target.files)}}})],1),r("el-col",{attrs:{span:7,offset:5}},[r("el-button",{attrs:{type:"submit"},on:{click:e.uploadFile}},[e._v("Upload")])],1)],1)])],1)],1)],1)])},a=[],s=r("82a3"),o=r.n(s),i=(r("7f7f"),r("96cf"),r("3b8d")),u=r("03e6"),c=r("8d81"),l=r.n(c),f={name:"MvodFileUpload",props:["accept","multiple","url"],data:function(){return{current:0,percentage:0,files:[],file:null,result:""}},methods:{fileChange:function(e){this.files=[],this.percentage=0;for(var t=0;t<e.length;t++)this.files.push(e[t])},uploadFile:function(){var e=Object(i["a"])(regeneratorRuntime.mark(function e(){var t,r,n,a,s,i,c,f,p,m,d,h;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:t=this.$refs.file.files,r=0;case 2:if(!(r<t.length)){e.next=31;break}n=1<<20,a=t[r].size,0,s=void 0,i=0,c=void 0,f=void 0,p=t[r].name,s=Math.ceil(a/n);case 11:if(!(i<=Math.max(1,s-1))){e.next=28;break}return c=i*n,f=Math.min(a,c+n),m=t[r].slice(c,f),d=new FormData,d.append("file",m),d.append("filename",p),d.append("md5",l()(p)),d.append("currentSlice",i),d.append("totalSlices",s-1),this.percentage=o()((i/(s-1)*100).toFixed(2)),e.next=24,u["a"].save(d,this.url);case 24:h=e.sent,h.success&&(i++,void 0!==h.data.url&&(console.log(h),this.result=h,this.$emit("onUploadSuccess",this.result))),e.next=11;break;case 28:r++,e.next=2;break;case 31:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}(),chooseFile:function(){this.$refs.file.click()}}},p=f,m=r("2877"),d=Object(m["a"])(p,n,a,!1,null,"2b9f8c3e",null);t["a"]=d.exports},e692:function(e,t){e.exports="\t\n\v\f\r   ᠎             　\u2028\u2029\ufeff"}}]);
//# sourceMappingURL=chunk-901b4e3e.d5edc71d.js.map