import React from "react";

import { shallow, mount } from "enzyme";

import CohortDetails from "./CohortDetails";

import { CohortsData } from "./Cohort";

describe("Cohort Details Component",()=>{
    test("should created the component",()=>{
        const wrapper = shallow(<CohortDetails cohort={CohortsData[0]}/>)
        expect(wrapper.exists()).toBe(true)
    })
    test("should passed the props",()=>{
        const wrapper = mount(<CohortDetails cohort={CohortsData[0]}/>)
        expect(wrapper.props().cohort).toEqual(CohortsData[0])
    })
    test("should h3 is displaying",()=>{
        const wrapper = mount(<CohortDetails cohort={CohortsData[0]}/>)
        expect(wrapper.find("h3").text()).toContain(CohortsData[0].cohortCode)
    })
    test("takes the snapshot",()=>{
        const wrapper = mount(<CohortDetails cohort={CohortsData[0]}/>)
        expect(wrapper).toMatchSnapshot();
    })
})