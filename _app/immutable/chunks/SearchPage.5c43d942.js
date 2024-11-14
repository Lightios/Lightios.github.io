import{S as y,b as D,a as L,m as w,p as b,u as d,f as g,$ as I,I as A,n as C,k as _,A as S,C as k,D as R,E as T,j as v,g as P,F as U,L as E,a0 as F,o as M,a1 as N,P as Q,c as W,q,d as z,a2 as B,Q as G,R as H,T as J}from"./index.35ff5d19.js";import{C as K}from"./CommonPage.85995e7a.js";import{p as O}from"./stores.becf8286.js";import{b as X}from"./paths.7d4772c8.js";import{t as Y}from"./i18n.ab836871.js";function Z(n){let e,t,a;return{c(){e=w("input"),this.h()},l(o){e=b(o,"INPUT",{placeholder:!0,class:!0}),this.h()},h(){d(e,"placeholder",n[1]),d(e,"class","text-[inherit] bg-transparent border-[1px] border-solid border-[var(--border)] px-[20px] py-[10px] rounded-[15px] flex-1 text-[1.15em]  svelte-c0g44u")},m(o,l){g(o,e,l),n[4](e),I(e,n[0]),t||(a=A(e,"input",n[5]),t=!0)},p(o,[l]){l&2&&d(e,"placeholder",o[1]),l&1&&e.value!==o[0]&&I(e,o[0])},i:C,o:C,d(o){o&&_(e),n[4](null),t=!1,a()}}}function $(n,e,t){let{value:a=""}=e,{placeholder:o=""}=e,l;function p(){l.focus()}function m(i){S[i?"unshift":"push"](()=>{l=i,t(2,l)})}function f(){a=this.value,t(0,a)}return n.$$set=i=>{"value"in i&&t(0,a=i.value),"placeholder"in i&&t(1,o=i.placeholder)},[a,o,l,p,m,f]}class x extends y{constructor(e){super(),D(this,e,$,Z,L,{value:0,placeholder:1,focus:3})}get focus(){return this.$$.ctx[3]}}function ee(n){let e,t,a,o,l,p;function m(s){n[8](s)}let f={placeholder:n[3]("SearchPlaceholder")};n[0]!==void 0&&(f.value=n[0]),t=new x({props:f}),n[7](t),S.push(()=>N(t,"value",m));const i=n[6].default,u=Q(i,n,n[9],null);return{c(){e=w("div"),k(t.$$.fragment),o=W(),l=w("div"),u&&u.c(),this.h()},l(s){e=b(s,"DIV",{class:!0});var c=q(e);R(t.$$.fragment,c),c.forEach(_),o=z(s),l=b(s,"DIV",{class:!0});var h=q(l);u&&u.l(h),h.forEach(_),this.h()},h(){d(e,"class","w-100% row"),d(l,"class","w-100% col flex-1")},m(s,c){g(s,e,c),T(t,e,null),g(s,o,c),g(s,l,c),u&&u.m(l,null),p=!0},p(s,c){const h={};c&8&&(h.placeholder=s[3]("SearchPlaceholder")),!a&&c&1&&(a=!0,h.value=s[0],B(()=>a=!1)),t.$set(h),u&&u.p&&(!p||c&512)&&G(u,i,s,s[9],p?J(i,s[9],c,null):H(s[9]),null)},i(s){p||(v(t.$$.fragment,s),v(u,s),p=!0)},o(s){P(t.$$.fragment,s),P(u,s),p=!1},d(s){s&&_(e),n[7](null),U(t),s&&_(o),s&&_(l),u&&u.d(s)}}}function te(n){let e,t;return e=new K({props:{title:n[1],$$slots:{default:[ee]},$$scope:{ctx:n}}}),{c(){k(e.$$.fragment)},l(a){R(e.$$.fragment,a)},m(a,o){T(e,a,o),t=!0},p(a,[o]){const l={};o&2&&(l.title=a[1]),o&525&&(l.$$scope={dirty:o,ctx:a}),e.$set(l)},i(a){t||(v(e.$$.fragment,a),t=!0)},o(a){P(e.$$.fragment,a),t=!1},d(a){U(e,a)}}}function se(n,e,t){let a,o;E(n,O,r=>t(5,a=r)),E(n,Y,r=>t(3,o=r));let{$$slots:l={},$$scope:p}=e,{title:m="Title"}=e,{search:f=""}=e,i;const u=F();let s=!1;M(()=>{let r=new URLSearchParams(window.location.search);t(0,f=r.get("q")??""),t(4,s=!0)});function c(r){S[r?"unshift":"push"](()=>{i=r,t(2,i)})}function h(r){f=r,t(0,f)}return n.$$set=r=>{"title"in r&&t(1,m=r.title),"search"in r&&t(0,f=r.search),"$$scope"in r&&t(9,p=r.$$scope)},n.$$.update=()=>{if(n.$$.dirty&1&&u("search",{search:f.trim().toLowerCase()}),n.$$.dirty&53&&s){let r=new URLSearchParams(window.location.search);r.set("q",f);const V=`${window.location.protocol}//${window.location.host}${window.location.pathname}?${r.toString()}`,j=window.history.state;window.history.replaceState(j,"",V),a.url.pathname.startsWith(`${X}/search`)&&i&&i.focus()}},[f,m,i,o,s,a,l,c,h,p]}class ie extends y{constructor(e){super(),D(this,e,se,te,L,{title:1,search:0})}}export{ie as S};