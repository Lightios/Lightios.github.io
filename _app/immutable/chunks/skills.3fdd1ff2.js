import{A as e}from"./UIcon.cd96527b.js";function u(t,...r){const s=Object.assign({},t);return Object.keys(s).forEach(n=>{r.includes(n)&&delete s[n]}),s}const a=t=>t,d=[a({name:"Programming Languages",slug:"pro-lang"}),a({name:"Frameworks",slug:"framework"}),a({name:"Libraries",slug:"library"}),a({name:"Languages",slug:"lang"}),a({name:"Databases",slug:"db"}),a({name:"ORMs",slug:"orm"}),a({name:"DevOps",slug:"devops"}),a({name:"Testing",slug:"test"}),a({name:"Dev Tools",slug:"devtools"}),a({name:"Markup Style",slug:"markup-style"}),a({name:"Design",slug:"design"}),a({name:"Soft Skills",slug:"soft"})],o=t=>{const r=u(t,"category");return t.category&&(r.category=d.find(s=>s.slug===t.category)),r},g=[o({slug:"python",color:"blue",description:"Python is an interpreted, high-level and general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.",logo:e.Python,name:"Python",category:"pro-lang"}),o({slug:"kotlin",color:"purple",description:"Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. Kotlin is designed to be fully interoperable with Java, and the JVM version of its standard library depends on the Java Class Library, but type inference allows its syntax to be more concise. Kotlin mainly targets the JVM, but also compiles to JavaScript or native code (via LLVM). Kotlin is sponsored by JetBrains and Google through the Kotlin Foundation.",logo:e.Kotlin,name:"Kotlin",category:"pro-lang"}),o({slug:"c#",color:"purple",description:"C# is a general-purpose, multi-paradigm programming language encompassing strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines. It was developed around 2000 by Microsoft within its .NET initiative and later approved as a standard by Ecma (ECMA-334) and ISO (ISO/IEC 23270:2018). C# is one of the programming languages designed for the Common Language Infrastructure.",logo:e.Csharp,name:"C#",category:"pro-lang"}),o({slug:"latex",color:"cyan",description:'LaTeX is a software system for document preparation. When writing, the writer uses plain text as opposed to the formatted text found in WYSIWYG ("what you see is what you get") word processors like Microsoft Word, LibreOffice Writer, and Apple Pages. The writer uses markup tagging conventions to define the general structure of a document (such as article, book, and letter), to stylize text throughout a document (such as bold and italics), and to add citations and cross-references. A TeX distribution such as TeX Live or MiKTeX is used to produce an output file (such as PDF or DVI) suitable for printing or digital distribution.',logo:e.Latex,name:"LaTeX",category:"markup-style"}),o({slug:"html",color:"orange",description:"HTML (HyperText Markup Language) is the most basic building block of the Web. It defines the meaning and structure of web content. Other technologies besides HTML are generally used to describe a web page's appearance/presentation (CSS) or functionality/behavior (JavaScript).",logo:e.HTML,name:"HTML",category:"markup-style"}),o({slug:"css",color:"blue",description:"CSS",logo:e.CSS,name:"CSS",category:"markup-style"}),o({slug:"kivy",color:"cyan",description:"Kivy is an open-source Python library for developing multitouch applications. It is cross-platform (Linux/OS X/Windows/Android/iOS) and released under the MIT license. The framework is stable and has a well-documented API, plus a programming guide to help you get started.",logo:e.KivyMD,name:"KivyMD",category:"framework"}),o({slug:"compose",color:"green",description:"Jetpack Compose is a modern toolkit for building native Android UI. Jetpack Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",logo:e.Compose,name:"Jetpack Compose",category:"framework"}),o({slug:"manim",color:"green",description:"Manim is a mathematical animation engine for explanatory math videos. It is powered by Python and many of its libraries, but it is not a library itself. It is a command-line tool that uses Python scripts to generate animations.",logo:e.Manim,name:"Manim",category:"framework"}),o({slug:"pillow",color:"green",description:"Pillow is the friendly PIL fork by Alex Clark and Contributors. PIL is the Python Imaging Library by Fredrik Lundh and Contributors.",logo:e.Pillow,name:"Pillow",category:"library"}),o({slug:"fpdf2",color:"green",description:"FPDF2 is a PDF document generator with support for UTF-8, Unicode, RTL languages, and HTML.",logo:e.FPDF2,name:"FPDF2",category:"library"}),o({slug:"pl",color:"red",description:"",logo:e.Polish,name:"Polish",category:"lang"}),o({slug:"en",color:"blue",description:"",logo:e.English,name:"English (C1)",category:"lang"})],m="Skills",y=(...t)=>g.filter(r=>t.includes(r.slug)),h=t=>{const r=[],s=[];return g.forEach(n=>{if(t.trim()&&!n.name.toLowerCase().includes(t.trim().toLowerCase()))return;if(!n.category){console.log(n.category),s.push(n);return}let i=r.find(c=>{var l;return c.category.slug===((l=n.category)==null?void 0:l.slug)});i||(i={items:[],category:n.category},r.push(i)),i.items.push(n)}),s.length!==0&&r.push({category:{name:"Others",slug:"others"},items:s}),r};export{h as a,y as g,g as i,m as t};