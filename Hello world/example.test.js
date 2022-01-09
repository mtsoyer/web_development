import React from "react"
import {expect} from "chai"
import {mount, shallow} from "enzyme"
import App from "./App"

describe ("Test suite for app componenet", function(){
    it("only one element in App class", function(){
        const wrapper = shallow(<App />)
        expect (wrapper.find("App")).length(1)
    })

    it("Dog List contaisn two dogs", function (){
        const wrapper = mount(<App />)
        expect(wrapper.find("Dogs").find('DogItem')).length(2)
    })

    it("Successfully add dogs to list when form submitted", function(){
        const wrapper = mount(<App />)
        const adddog = wrapper.find('AddDog')

        adddog.find("#dogName").get(0).value = "Lola"
        adddog.find("#imageURL").get(0).value = "https....."
        adddog.find("#dogbreed").get(0).value = "Beagle"

        const form = adddog.find("form")
        form.simulate("submit")
        expect(wrapper.find("Dogs").find("DogItem")).length(3)

        expect(wrapper.state().dogs[2].name == "Lola")

    })

    it("Removes one dog when we remove it from list", function(){
        const wrapper = mount(<App />)
        const deleteLink = wrapper.find("a").first()

        deleteLink.simulate("click")

        expect(wrapper.find("Dogs").find("DogItem")).length(1)
    })
})