(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-257daf35"],{"10ff":function(e,t,r){var n=r("e53d").parseFloat,a=r("a1ce").trim;e.exports=1/n(r("e692")+"-0")!==-1/0?function(e){var t=a(String(e),3),r=n(t);return 0===r&&"-"==t.charAt(0)?-0:r}:n},"4fcb":function(e,t,r){var n=r("63b6"),a=r("10ff");n(n.S+n.F*(Number.parseFloat!=a),"Number",{parseFloat:a})},"69b9":function(e,t,r){r("4fcb"),e.exports=r("584a").Number.parseFloat},"7ef2":function(e,t,r){"use strict";r.r(t);var n=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[e.showAddForm?r("el-form",{staticClass:"mvod-align-center"},[r("el-form-item",{attrs:{label:"Name"}},[r("el-input",{model:{value:e.video.name,callback:function(t){e.$set(e.video,"name",t)},expression:"video.name"}})],1),r("el-form-item",{attrs:{label:"Preview"}},[e.video.show?r("p",[e._v("Video has upload，please wait for transfer")]):e._e(),r("input",{directives:[{name:"model",rawName:"v-model",value:e.video.url,expression:"video.url"}],attrs:{hidden:""},domProps:{value:e.video.url},on:{input:function(t){t.target.composing||e.$set(e.video,"url",t.target.value)}}})]),r("el-form-item",[r("mvod-file-upload",{attrs:{url:"/upload/video",accept:"video/*"},on:{onUploadSuccess:e.handleUploadSuccess}})],1),r("el-form-item",{attrs:{label:"Description"}},[r("el-input",{attrs:{type:"textarea"},model:{value:e.video.description,callback:function(t){e.$set(e.video,"description",t)},expression:"video.description"}})],1),r("el-form-item",[r("el-button",{attrs:{type:"primary"},on:{click:e.saveVideo}},[e._v("Save")]),r("el-button",{on:{click:e.hiddenForm}},[e._v("Return")])],1)],1):r("div",[r("el-table",{attrs:{data:e.data,border:"",stripe:""}},[r("el-table-column",{attrs:{type:"expand"},scopedSlots:e._u([{key:"default",fn:function(t){return[r("el-form",{staticClass:"mvod-align-center"},[r("el-form-item",{attrs:{label:"Name"}},[r("el-input",{model:{value:t.row.name,callback:function(r){e.$set(t.row,"name",r)},expression:"props.row.name"}})],1),r("el-form-item",{attrs:{label:"Preview"}},[r("video",{attrs:{poster:t.row.poster,src:t.row.url,controls:"",muted:"",width:"100%"},domProps:{muted:!0}},[e._v("\n                                Your browser do not support video tag\n                            ")])]),r("el-form-item",{attrs:{label:"Description"}},[r("el-input",{attrs:{type:"textarea"},model:{value:t.row.description,callback:function(r){e.$set(t.row,"description",r)},expression:"props.row.description"}})],1),r("el-form-item",{attrs:{label:"Release Time"}},[r("el-date-picker",{attrs:{type:"datetime"},model:{value:t.row.releaseTime,callback:function(r){e.$set(t.row,"releaseTime",r)},expression:"props.row.releaseTime"}})],1),r("el-form-item",[r("el-button",{attrs:{type:"primary"},on:{click:function(r){return e.save(t.row)}}},[e._v("Save")]),r("el-button",{attrs:{type:"danger"},on:{click:function(r){return e.deleteRow(t.row)}}},[e._v("Delete")])],1)],1)]}}])}),r("el-table-column",{attrs:{label:"Name",prop:"name"}}),r("el-table-column",{attrs:{label:"Description",prop:"description"}}),r("el-table-column",{attrs:{formatter:e.formatterDate,label:"Release Time",prop:"releaseTime"}}),r("el-table-column",{attrs:{formatter:e.formatterUser,label:"Author",prop:"user"}}),r("el-table-column",{scopedSlots:e._u([{key:"header",fn:function(t){return[r("el-button",{attrs:{type:"primary"},on:{click:function(t){return e.showForm()}}},[e._v("Add")])]}},{key:"default",fn:function(e){}}])})],1),r("el-pagination",{staticClass:"mvod-align-center",attrs:{"current-page":e.currentPage,"page-size":e.pageSize,total:this.videoList.length,layout:"prev, pager, next"},on:{"update:currentPage":function(t){e.currentPage=t},"update:current-page":function(t){e.currentPage=t},"update:pageSize":function(t){e.pageSize=t},"update:page-size":function(t){e.pageSize=t},"current-change":e.currentChange,"next-click":e.next,"prev-click":e.prev}})],1)],1)},a=[],i=(r("7f7f"),r("cebc")),o=(r("96cf"),r("3b8d")),s=r("03e6"),c=r("dc65"),u={name:"MvodUserModifyVideo",components:{MvodFileUpload:c["a"]},data:function(){return{videoList:[],currentPage:1,pageSize:5,data:[],video:{show:!1,author:null,url:"",poster:"",description:""},showAddForm:!1}},computed:{total:function(){return this.videoList.length}},methods:{saveVideo:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(){var t,r;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return t=Object(i["a"])({},this.video),t.author=this.$store.getters.getUser,e.next=4,s["a"].save(t,"/video/");case 4:return r=e.sent,this.$message({message:r.message,type:r.success?"success":"error"}),e.next=8,this.getData();case 8:this.data=this.videoList.slice(0,this.pageSize),this.video={show:!1,author:null,url:"",poster:"",description:""};case 10:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}(),save:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t){var r;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,s["a"].update(t,"/video");case 2:if(r=e.sent,!r.success){e.next=7;break}return e.next=6,this.getData();case 6:this.data=this.videoList.slice(0,this.pageSize);case 7:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),deleteRow:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(t){var r;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,s["a"].deleteById(t.id,"/video/");case 2:if(r=e.sent,!r.success){e.next=7;break}return e.next=6,this.getData();case 6:this.data=this.videoList.slice(0,this.pageSize);case 7:case"end":return e.stop()}},e,this)}));function t(t){return e.apply(this,arguments)}return t}(),hiddenForm:function(){this.showAddForm=!1},showForm:function(){this.showAddForm=!0},handleUploadSuccess:function(e){console.log(e),e.success&&(this.video.url=e.data.url,this.video.show=!0)},handleRemove:function(e){console.log(this.video),console.log(e),this.video.url=""},beforeVideoUpload:function(e){var t=e.type.indexOf("video/")>-1;return t},handleExceed:function(){this.$message.error("only can upload one video please remove and continue")},prev:function(){var e=this.videoList.slice(0);this.currentPage=this.currentPage-1>=0?this.currentPage-1:0;var t=(this.currentPage-1)*this.pageSize,r=this.currentPage*this.pageSize;this.data=e.slice(t,r)},next:function(){var e=this.videoList.slice(0);this.currentPage=this.currentPage+1<=this.total?this.currentPage+1:this.total;var t=(this.currentPage-1)*this.pageSize,r=this.currentPage*this.pageSize;this.data=e.slice(t,r)},currentChange:function(e){var t=this.videoList.slice(0),r=(e-1)*this.pageSize,n=e*this.pageSize;this.data=t.slice(r,n)},formatterDate:function(e){return Date(e.releaseTime)},formatterUser:function(e){return e.author.name||e.author.account},getData:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(){var t;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,s["a"].getById(this.$store.getters.getUser.id,"/video/user/");case 2:t=e.sent,t.success&&(this.videoList=t.data.list);case 4:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}()},mounted:function(){var e=Object(o["a"])(regeneratorRuntime.mark(function e(){return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.getData();case 2:this.data=this.videoList.slice(0,this.pageSize);case 3:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}()},l=u,d=r("2877"),p=Object(d["a"])(l,n,a,!1,null,"664c3066",null);t["default"]=p.exports},"82a3":function(e,t,r){e.exports=r("69b9")},"8d81":function(e,t,r){var n;(function(a){"use strict";function i(e,t){var r=(65535&e)+(65535&t),n=(e>>16)+(t>>16)+(r>>16);return n<<16|65535&r}function o(e,t){return e<<t|e>>>32-t}function s(e,t,r,n,a,s){return i(o(i(i(t,e),i(n,s)),a),r)}function c(e,t,r,n,a,i,o){return s(t&r|~t&n,e,t,a,i,o)}function u(e,t,r,n,a,i,o){return s(t&n|r&~n,e,t,a,i,o)}function l(e,t,r,n,a,i,o){return s(t^r^n,e,t,a,i,o)}function d(e,t,r,n,a,i,o){return s(r^(t|~n),e,t,a,i,o)}function p(e,t){var r,n,a,o,s;e[t>>5]|=128<<t%32,e[14+(t+64>>>9<<4)]=t;var p=1732584193,f=-271733879,h=-1732584194,m=271733878;for(r=0;r<e.length;r+=16)n=p,a=f,o=h,s=m,p=c(p,f,h,m,e[r],7,-680876936),m=c(m,p,f,h,e[r+1],12,-389564586),h=c(h,m,p,f,e[r+2],17,606105819),f=c(f,h,m,p,e[r+3],22,-1044525330),p=c(p,f,h,m,e[r+4],7,-176418897),m=c(m,p,f,h,e[r+5],12,1200080426),h=c(h,m,p,f,e[r+6],17,-1473231341),f=c(f,h,m,p,e[r+7],22,-45705983),p=c(p,f,h,m,e[r+8],7,1770035416),m=c(m,p,f,h,e[r+9],12,-1958414417),h=c(h,m,p,f,e[r+10],17,-42063),f=c(f,h,m,p,e[r+11],22,-1990404162),p=c(p,f,h,m,e[r+12],7,1804603682),m=c(m,p,f,h,e[r+13],12,-40341101),h=c(h,m,p,f,e[r+14],17,-1502002290),f=c(f,h,m,p,e[r+15],22,1236535329),p=u(p,f,h,m,e[r+1],5,-165796510),m=u(m,p,f,h,e[r+6],9,-1069501632),h=u(h,m,p,f,e[r+11],14,643717713),f=u(f,h,m,p,e[r],20,-373897302),p=u(p,f,h,m,e[r+5],5,-701558691),m=u(m,p,f,h,e[r+10],9,38016083),h=u(h,m,p,f,e[r+15],14,-660478335),f=u(f,h,m,p,e[r+4],20,-405537848),p=u(p,f,h,m,e[r+9],5,568446438),m=u(m,p,f,h,e[r+14],9,-1019803690),h=u(h,m,p,f,e[r+3],14,-187363961),f=u(f,h,m,p,e[r+8],20,1163531501),p=u(p,f,h,m,e[r+13],5,-1444681467),m=u(m,p,f,h,e[r+2],9,-51403784),h=u(h,m,p,f,e[r+7],14,1735328473),f=u(f,h,m,p,e[r+12],20,-1926607734),p=l(p,f,h,m,e[r+5],4,-378558),m=l(m,p,f,h,e[r+8],11,-2022574463),h=l(h,m,p,f,e[r+11],16,1839030562),f=l(f,h,m,p,e[r+14],23,-35309556),p=l(p,f,h,m,e[r+1],4,-1530992060),m=l(m,p,f,h,e[r+4],11,1272893353),h=l(h,m,p,f,e[r+7],16,-155497632),f=l(f,h,m,p,e[r+10],23,-1094730640),p=l(p,f,h,m,e[r+13],4,681279174),m=l(m,p,f,h,e[r],11,-358537222),h=l(h,m,p,f,e[r+3],16,-722521979),f=l(f,h,m,p,e[r+6],23,76029189),p=l(p,f,h,m,e[r+9],4,-640364487),m=l(m,p,f,h,e[r+12],11,-421815835),h=l(h,m,p,f,e[r+15],16,530742520),f=l(f,h,m,p,e[r+2],23,-995338651),p=d(p,f,h,m,e[r],6,-198630844),m=d(m,p,f,h,e[r+7],10,1126891415),h=d(h,m,p,f,e[r+14],15,-1416354905),f=d(f,h,m,p,e[r+5],21,-57434055),p=d(p,f,h,m,e[r+12],6,1700485571),m=d(m,p,f,h,e[r+3],10,-1894986606),h=d(h,m,p,f,e[r+10],15,-1051523),f=d(f,h,m,p,e[r+1],21,-2054922799),p=d(p,f,h,m,e[r+8],6,1873313359),m=d(m,p,f,h,e[r+15],10,-30611744),h=d(h,m,p,f,e[r+6],15,-1560198380),f=d(f,h,m,p,e[r+13],21,1309151649),p=d(p,f,h,m,e[r+4],6,-145523070),m=d(m,p,f,h,e[r+11],10,-1120210379),h=d(h,m,p,f,e[r+2],15,718787259),f=d(f,h,m,p,e[r+9],21,-343485551),p=i(p,n),f=i(f,a),h=i(h,o),m=i(m,s);return[p,f,h,m]}function f(e){var t,r="",n=32*e.length;for(t=0;t<n;t+=8)r+=String.fromCharCode(e[t>>5]>>>t%32&255);return r}function h(e){var t,r=[];for(r[(e.length>>2)-1]=void 0,t=0;t<r.length;t+=1)r[t]=0;var n=8*e.length;for(t=0;t<n;t+=8)r[t>>5]|=(255&e.charCodeAt(t/8))<<t%32;return r}function m(e){return f(p(h(e),8*e.length))}function v(e,t){var r,n,a=h(e),i=[],o=[];for(i[15]=o[15]=void 0,a.length>16&&(a=p(a,8*e.length)),r=0;r<16;r+=1)i[r]=909522486^a[r],o[r]=1549556828^a[r];return n=p(i.concat(h(t)),512+8*t.length),f(p(o.concat(n),640))}function g(e){var t,r,n="0123456789abcdef",a="";for(r=0;r<e.length;r+=1)t=e.charCodeAt(r),a+=n.charAt(t>>>4&15)+n.charAt(15&t);return a}function b(e){return unescape(encodeURIComponent(e))}function w(e){return m(b(e))}function x(e){return g(w(e))}function k(e,t){return v(b(e),b(t))}function y(e,t){return g(k(e,t))}function S(e,t,r){return t?r?k(t,e):y(t,e):r?w(e):x(e)}n=function(){return S}.call(t,r,t,e),void 0===n||(e.exports=n)})()},a1ce:function(e,t,r){var n=r("63b6"),a=r("25eb"),i=r("294c"),o=r("e692"),s="["+o+"]",c="​",u=RegExp("^"+s+s+"*"),l=RegExp(s+s+"*$"),d=function(e,t,r){var a={},s=i(function(){return!!o[e]()||c[e]()!=c}),u=a[e]=s?t(p):o[e];r&&(a[r]=u),n(n.P+n.F*s,"String",a)},p=d.trim=function(e,t){return e=String(a(e)),1&t&&(e=e.replace(u,"")),2&t&&(e=e.replace(l,"")),e};e.exports=d},dc65:function(e,t,r){"use strict";var n=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[e.files.length>0?r("div",e._l(e.files,function(t){return r("div",{key:t.name,staticClass:"mvod-margin-top-1"},[r("el-card",[r("el-row",[r("el-row",{attrs:{align:"middle"}},[r("el-col",[e._v("\n                            "+e._s(t.name)+"\n                            "),r("el-progress",{attrs:{percentage:e.percentage}})],1)],1)],1)],1)],1)}),0):e._e(),r("div",{staticClass:"mvod-margin-top-1"},[r("el-card",[r("el-row",[r("el-row",{attrs:{align:"middle"}},[r("form",{ref:"form",attrs:{enctype:"multipart/form-data",id:"form"}},[r("el-col",{attrs:{span:12}},[r("el-button",{attrs:{type:"primary"},on:{click:e.chooseFile}},[e._v("Choose...")]),r("input",{ref:"file",staticClass:"mvod-hidden",attrs:{type:"file",accept:e.accept||"*"},on:{change:function(t){return e.fileChange(t.target.files)}}})],1),r("el-col",{attrs:{span:7,offset:5}},[r("el-button",{attrs:{type:"submit"},on:{click:e.uploadFile}},[e._v("Upload")])],1)],1)])],1)],1)],1)])},a=[],i=r("82a3"),o=r.n(i),s=(r("7f7f"),r("96cf"),r("3b8d")),c=r("03e6"),u=r("8d81"),l=r.n(u),d={name:"MvodFileUpload",props:["accept","multiple","url"],data:function(){return{current:0,percentage:0,files:[],file:null,result:""}},methods:{fileChange:function(e){this.files=[],this.percentage=0;for(var t=0;t<e.length;t++)this.files.push(e[t])},uploadFile:function(){var e=Object(s["a"])(regeneratorRuntime.mark(function e(){var t,r,n,a,i,s,u,d,p,f,h,m;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:t=this.$refs.file.files,r=0;case 2:if(!(r<t.length)){e.next=31;break}n=1<<20,a=t[r].size,0,i=void 0,s=0,u=void 0,d=void 0,p=t[r].name,i=Math.ceil(a/n);case 11:if(!(s<=Math.max(1,i-1))){e.next=28;break}return u=s*n,d=Math.min(a,u+n),f=t[r].slice(u,d),h=new FormData,h.append("file",f),h.append("filename",p),h.append("md5",l()(p)),h.append("currentSlice",s),h.append("totalSlices",i-1),this.percentage=o()((s/(i-1)*100).toFixed(2)),e.next=24,c["a"].save(h,this.url);case 24:m=e.sent,m.success&&(s++,void 0!==m.data.url&&(console.log(m),this.result=m,this.$emit("onUploadSuccess",this.result))),e.next=11;break;case 28:r++,e.next=2;break;case 31:case"end":return e.stop()}},e,this)}));function t(){return e.apply(this,arguments)}return t}(),chooseFile:function(){this.$refs.file.click()}}},p=d,f=r("2877"),h=Object(f["a"])(p,n,a,!1,null,"2b9f8c3e",null);t["a"]=h.exports},e692:function(e,t){e.exports="\t\n\v\f\r   ᠎             　\u2028\u2029\ufeff"}}]);
//# sourceMappingURL=chunk-257daf35.83a21fc6.js.map