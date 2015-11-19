EatingWell Code Challenge
=======================================================================

Applicant must create an application using the Play framework version 2.3 [1], in Scala.
The finished application should be a reflection of the applicants ability to
use the frameworks and tools that they are most likely to use in their possible
work at EatingWell/Meredith. 


The application will be a simple browser of provided content. This content will
be in the form of XML and should be used to views according to the requirements
listed below. 

**Requirements:**

1. The application will compile
2. The root route `/` of the application will be a browse view that displays:
	1. The ability to move between pages of content
	2. The ability to choose how many items of content to show per page
	3. The ability to filter content by its type
3. A detail view `/detail/{contentType}/{id}` that displays:
	1. Links to the previous page
	2. Information about the content being displayed
4. The project should use the bootstrap CSS vm [2] framework for style and valid HTML
5. The project should load the provided XML _once_ on startup. The XML should be stored in a file and by setting a property in the application.conf file, it should be able to load other files if neccesary.
	1. The start up class [3] should _not_ be in the default package and should reside with other controllers or configuration classes. 
6. Error Pages such as 404 should use a non-default page and hide internal details. 


The Applicant's code will be reviewed and internally graded by the EatingWell 
tech team on meeting the requirements, design, organization of the codebase. A 
full code review with feedback from the team will be provided to the applicant
after their submission. 

**Provided:**

Please use the following XML for data for the application: 

	<?xml version="1.0" encoding="UTF-8"?>
	<Content>
		<Food>
			<Item>
				<Name>Bagel</Name>
				<Description>A delicious bagel</Description>
				<Image>
					<Thumb>http://lorempixel.com/200/150/food/</Thumb>
					<Large>http://lorempixel.com/400/300/food/</Large>
				</Image>
			</Item>
			<Item>
				<Name>Omelet</Name>
				<Description>A very tasty omelet</Description>
				<Image>
					<Thumb>http://lorempixel.com/200/150/food/</Thumb>
					<Large>http://lorempixel.com/400/300/food/</Large>
				</Image>
			</Item>
			<Item>
				<Name>Salad</Name>
				<Description>A really leafy and tasty Salad</Description>
				<Image>
					<Thumb>http://lorempixel.com/200/150/food/</Thumb>
					<Large>http://lorempixel.com/400/300/food/</Large>
				</Image>
			</Item>
			<Item>
				<Name>Curry</Name>
				<Description>A hearty and spicy meal</Description>
				<Image>
					<Thumb>http://lorempixel.com/200/150/food/</Thumb>
					<Large>http://lorempixel.com/400/300/food/</Large>
				</Image>
			</Item>
		</Food>
		<Products>
			<Item>
				<Name>Baking Pan</Name>
				<UUID>200dc979-b1a1-4d31-9113-e4512f70c4b5</UUID>
				<Description>This lovely baking pan will be a great addition to any chef's home. Use it to make cookies, pastries, or even to cook chicken or meals in.</Description>
				<Price>14.99</Price>
				<Image>
					<Thumb>http://lorempixel.com/200/150/food/</Thumb>
					<Large>http://lorempixel.com/400/300/food/</Large>
				</Image>
			</Item>
			<Item>
				<Name>Blender</Name>
				<UUID>7ac7ffdf-cc2d-4a2e-a637-85c0efb48595</UUID>
				<Description>This amazing blender comes with 5 settings and help you get started on your smoothie summer plans! Just whip up some berries and you'll be relaxing in no time. Comes with lifetime warrantee and our guarantee that you'll love it or your money back.</Description>
				<Price>29.99</Price>
				<Image>
					<Thumb>http://lorempixel.com/200/150/food/</Thumb>
					<Large>http://lorempixel.com/400/300/food/</Large>
				</Image>
			</Item>
			<Item>
				<Name>Collander</Name>
				<UUID>6fd3744f-9383-4ffb-91b2-e170d872a50e</UUID>
				<Description>Take away the strain from your strainer! This titanium Collander comes with an extending handle to match any sink! Skip the balancing act when you're draining and straining your water from meals or vegetables. Handle extends up to 15 feet. </Description>
				<Price>15.99</Price>
				<Image>
					<Thumb>http://lorempixel.com/200/150/food/</Thumb>
					<Large>http://lorempixel.com/400/300/food/</Large>
				</Image>
			</Item>
			<Item>
				<Name>Knife</Name>
				<UUID>dac71110-58b8-4a15-b34a-168e653014e6</UUID>
				<Description>It slices, it dices, it's environmentally friendly! This titanium knife comes with a bone handle made from the strongest bones on the planet: Chickens! Get a slice of your life together with this life-time warrantee, satisfaction guaranteed one of a kind deal.</Description>
				<Price>9.99</Price>
				<Image>
					<Thumb>http://lorempixel.com/200/150/food/</Thumb>
					<Large>http://lorempixel.com/400/300/food/</Large>
				</Image>
			</Item>
		</Products>
	</Content>

[1]:https://playframework.com/documentation/2.3.x/Home
[2]:http://getbootstrap.com/getting-started/#download 
[3]:https://www.playframework.com/documentation/2.0/JavaGlobal
