import{S as m,i as _,s as g,k as d,l as o,p as l,Q as h,b as q,n as f,h as z}from"./index.f1690066.js";function w(n){let s,a,r;return{c(){s=d("img"),this.h()},l(e){s=o(e,"IMG",{class:!0,src:!0,alt:!0,height:!0,width:!0}),this.h()},h(){l(s,"class",a=`rounded-${n[3]} ${n[4]} aspect-square`),h(s.src,r=n[0])||l(s,"src",r),l(s,"alt",n[1]),l(s,"height",n[2]),l(s,"width",n[2])},m(e,i){q(e,s,i)},p(e,[i]){i&24&&a!==(a=`rounded-${e[3]} ${e[4]} aspect-square`)&&l(s,"class",a),i&1&&!h(s.src,r=e[0])&&l(s,"src",r),i&2&&l(s,"alt",e[1]),i&4&&l(s,"height",e[2]),i&4&&l(s,"width",e[2])},i:f,o:f,d(e){e&&z(s)}}}function C(n,s,a){let{src:r}=s,{alt:e}=s,{size:i=50}=s,{radius:u="15px"}=s,{classes:c=""}=s;return n.$$set=t=>{"src"in t&&a(0,r=t.src),"alt"in t&&a(1,e=t.alt),"size"in t&&a(2,i=t.size),"radius"in t&&a(3,u=t.radius),"classes"in t&&a(4,c=t.classes)},[r,e,i,u,c]}class b extends m{constructor(s){super(),_(this,s,C,w,g,{src:0,alt:1,size:2,radius:3,classes:4})}}export{b as C};
