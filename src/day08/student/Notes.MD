# Selenium Locators

##### Basic Locators:

* id
* className
* name
* linkText
* partialLinkText
* xpath
* css locators
<hr/>
<br/>

#### CSS locators:
<u>Tag + id</u>

css = (tag)input + "#"twotabsearchtextbox(value of id)

css = input#twotabsearchtextbox

css = input[id = twotabsearchtextbox]
<br/>
<br/>


<u>Tag + className</u>

css = (tag)span + "."nav-line-2(value of class)

css = span.nav-line-2

css = span[class = nav-line-2]
<br/>
<br/>


<u>Tag + attribute</u>

css = (tag)a + "[" + aria-label = 'Holiday Toy List' + "]"

css = a[aria-label = 'Holiday Toy List']
<br/>
<br/>


<u>Tag + class + attribute</u>

css = (tag) + className[attribute = value]

css = a.a-link-normal.image-redirect.aok-block.image-window[aria-label = 'Electronic Gifts']

css = img.landscape-image[alt = Tech]
<br/>
<br/>


<u>Values of attributes (sub-string)</u>

1. ^ => starts-with

2. $ => ends-with

3. *=> contains

Example:

css = img.landscape-image[alt^ = 'Top 100']

css = img[class = 'landscape-image'][alt^ = 'Top 100']
<br/>
<br/>


<u>Parent - child relations <br/>
parent locator > child locator</u>

tag[class = 'classValue'] > div:first-child

div[class = 'value'] > div : first-child

<br/>
tag.classValue:first-child

tag.classValue:last-child

tag.classValue:nth-child(n)